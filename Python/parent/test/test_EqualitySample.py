import unittest

import sys, os
testdir = os.path.dirname(__file__)
srcdir = '../../parent'
sys.path.insert(0, os.path.abspath(os.path.join(testdir, srcdir)))

from src.EqualitySample import EqualitySample

class EqualitySampleTest(unittest.TestCase):

    def test_RandomNumberTest(self):
        print ('test_RandomNumberTest()')
        #Arrange
        #equalitySampleObj = EqualitySample("Amit", 1000, 10)
        equalitySampleObj = EqualitySample()

        #Act
        actualResult1 = equalitySampleObj.getTextApendedWithRandomNumber("Hello")
        actualResult2 = equalitySampleObj.getTextApendedWithRandomNumber("Hello")

        #Assert
        self.assertIsNot(actualResult1, actualResult2)
    

    def test_weekDaysLists(self):
        print ('test_weekDaysLists()')

        #Arrange
        #equalitySampleObj = EqualitySample("Amit", 1000, 10)
        equalitySampleObj = EqualitySample()

        #Act
        actualResult = equalitySampleObj.allWeekDays()

        #Assert
        self.assertListEqual(actualResult, ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"])

    
    def test_weekDay(self):
        print ('test_weekDay()')

        #Arrange
        #equalitySampleObj = EqualitySample("Amit", 1000, 10)
        equalitySampleObj = EqualitySample()

        #Act
        actualResult = equalitySampleObj.weekDay()

        #Assert
        self.assertIn(actualResult, ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"])


    def test_MaturityAmount(self):
        print ('test_MaturityAmount()')

        #Arrange
        #equalitySampleObj = EqualitySample("Amit", 1000, 10)
        equalitySampleObj = EqualitySample()

        #Act
        actualResult = equalitySampleObj.getMaturityAmount(1000, 10)

        #Assert
        self.assertAlmostEquals(actualResult, 1100.00, 0.00)



if __name__ == "__main__":
      unittest.main()

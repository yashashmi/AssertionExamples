import unittest
from src.BooleanSample import BooleanSample

class BooleanSampleTest(unittest.TestCase):
    def test_isWeekDay(self):
        print ('test_isWeekDay()')
        #Arrange
        booleanSample = BooleanSample("Monday")

        #Act
        actualResult = booleanSample.isWeekDay()

        #Assert
        self.assertTrue(actualResult)
        
        #def test_isNotAWeekDay(self):
        #    print ('test_isNotAWeekDay()')
        #Arrange
        #booleanSample = BooleanSample("Sunday")

        #Act
        #actualResult = booleanSample.isWeekDay()

        #Assert
        #self.assertTrue(actualResult)

if __name__ == "__main__":
      unittest.main()
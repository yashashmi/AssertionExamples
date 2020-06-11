import unittest

import sys, os
testdir = os.path.dirname(__file__)
srcdir = '../../parent'
sys.path.insert(0, os.path.abspath(os.path.join(testdir, srcdir)))

from src.BooleanSample import BooleanSample

class BooleanSampleTest(unittest.TestCase):
    def test_isWeekDay(self):
        print ('test_isWeekDay()')
        #Arrange
        booleanSample = BooleanSample()

        #Act
        actualResult = booleanSample.isWeekDay("Monday")

        #Assert
        self.assertTrue(actualResult)
        
    def test_isNotAWeekDay(self):
        print ('test_isNotAWeekDay()')
        #Arrange
        booleanSample = BooleanSample()

        #Act
        actualResult = booleanSample.isWeekDay("Sunday")

        #Assert
        self.assertFalse(actualResult)

if __name__ == "__main__":
      unittest.main()
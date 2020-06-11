import unittest

import sys, os
testdir = os.path.dirname(__file__)
srcdir = '../../parent'
sys.path.insert(0, os.path.abspath(os.path.join(testdir, srcdir)))

from src.ClassWithException import Name

class NameTest(unittest.TestCase):

    def test_HelloName(self):
        print ('test_HelloName()')
        #Arrange
        nameObj = Name()

        #Act
        actualResult = nameObj.helloName("Amit")

        #Assert
        self.assertEquals(actualResult, "Hello Amit")


    def test_HelloNameThrowsException(self):
        print ('test_HelloNameThrowsException()')
        #Arrange
        nameObj = Name()

        #Act
        with self.assertRaises(Exception) as context:
            actualResult = nameObj.helloName("")

        self.assertTrue("Invalid Name, Name cannot be empty" in context.exception)

if __name__ == "__main__":
      unittest.main()
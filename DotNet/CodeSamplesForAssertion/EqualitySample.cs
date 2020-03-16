using System;

namespace CodeSamplesForAssertion
{
    public class EqualitySample
    {
        //String equality. Assert.AreEqual() or Assert.That()
        public string GetWelcomeMessage(string yourName)
        {
            return "Welcome " + yourName;
        }

        //This function could be tested using Assert.AreNotEqual()
        public string GetTextAppendWithRandomNumber(string someText)
        {
            var rand = new Random();

            return someText + rand.Next();
        }

        //Integer equality. Assert.AreEqual()
        public int AddNumbers(int num1, int num2)
        {
            return num1 + num2;
        }

        //Double equality. Assert.AreEqual()
        public double GetMaturityAmout(double principal, double interest)
        {
            var amount = principal + (principal * interest / 100);
            return Math.Round(amount,2,MidpointRounding.AwayFromZero);
        }

    }
}
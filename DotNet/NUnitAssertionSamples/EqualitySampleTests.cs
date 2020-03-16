namespace NUnitAssertionSamples
{
    using NUnit.Framework;
    using CodeSamplesForAssertion;

    [TestFixture]
    public class EqualitySampleTests
    {

        [Test]
        public void ShouldReturnWelcomeMessage()
        {
            var equalitySample = new EqualitySample();
            var result = equalitySample.GetWelcomeMessage("Rudy");

            Assert.AreEqual("Welcome Rudy", result);

            //The new way of Assertion:
            Assert.That(result, Is.EqualTo("Welcome Rudy"));
        }

        [Test]
        public void ShouldNotReturnTextWithSapces()
        {
            var someText = "SomeText";
            var equalitySample = new EqualitySample();
            var result = equalitySample.GetTextAppendWithRandomNumber(someText);
            var result1 = equalitySample.GetTextAppendWithRandomNumber(someText);

            Assert.AreNotEqual(result, result1);

            //The new way of Assertion:
            Assert.That(result, Is.Not.EqualTo(result1));
        }

        [Test]
        public void ShouldReturnSumOfTwoNumbers()
        {
            var equalitySample = new EqualitySample(); 
            var result  = equalitySample.AddNumbers(8,12);

            Assert.AreEqual(20,result);

            //The new way of Assertion:
            Assert.That(result,Is.EqualTo(20));
        }

        [Test]
        public void ShouldReturnTheMaturityAmount()
        {
            var equalitySample = new EqualitySample(); 
            var result  = equalitySample.GetMaturityAmout(30.14,9.34);

            Assert.AreEqual(32.95,result,0.1);

            //The new way of Assertion:
            Assert.That(result,Is.EqualTo(32.95).Within(0.1));
        }

    }
}
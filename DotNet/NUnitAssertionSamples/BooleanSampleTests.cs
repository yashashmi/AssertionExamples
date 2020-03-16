using NUnit.Framework;
using CodeSamplesForAssertion;

namespace NUnitAssertionSamples
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void ShouldReturnFalseWhenSaturday()
        {
            var booleanSample = new BooleanSample();
            var result = booleanSample.IsWeekDay("Saturday");

            Assert.IsFalse(result);
        }
        [Test]
        public void ShouldReturnFalseWhenSunday()
        {
            var booleanSample = new BooleanSample();
            var result = booleanSample.IsWeekDay("Sunday");

            Assert.IsFalse(result);
        }

        [Test]
        public void ShouldReturnTrueForWeekday()
        {
            var booleanSample = new BooleanSample();
            var result = booleanSample.IsWeekDay("Monday");

            Assert.IsTrue(result);
        }

    }
}
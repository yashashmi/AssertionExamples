using System;
using CodeSamplesForAssertion;
using NUnit.Framework;

namespace NUnitAssertionSamples
{
    public class ClassWithExceptionsTest
    {
        [Test]
        public void ThrowsExceptionWhenNameIsNull()
        {
            var obj = new ClassWithExceptions();

            Assert.Throws<ArgumentNullException>(() => obj.SayHello(null));
        }

        [Test]
        public void ShouldHaveValidMessageForExceptionWhenNameIsNull()
        {
            var obj = new ClassWithExceptions();

            ArgumentNullException ex = Assert.Throws<ArgumentNullException>(() => obj.SayHello(null));

            Assert.AreEqual("Name cannot be null", ex.Message);
            //OR
            Assert.That(ex.Message, Is.EqualTo("Name cannot be null"));

            //OR above three lines could be replaced with:
            Assert.Throws(Is.TypeOf<ArgumentNullException>().And.Message.EqualTo("Name cannot be null"), () => obj.SayHello(null));


        }
    }
}
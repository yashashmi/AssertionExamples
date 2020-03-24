namespace NUnitAssertionSamples
{
    using NUnit.Framework;
    using CodeSamplesForAssertion;
    using System.Collections.Generic;

    [TestFixture]
    public class DerivedClassTests
    {
        
        [Test]
        public void ShouldBeAnInstanceOfIAnimal()
        {
            var derivedClass = DerivedClass.GetInstance();
            Assert.IsInstanceOf<IAnimal>(derivedClass);

            //OR:
            Assert.That(derivedClass,Is.InstanceOf<IAnimal>());
        }

        [Test]
        public void ShouldHaveSameInstanceEveryTime(){
            var instance = DerivedClass.GetInstance();
            var instance2 = DerivedClass.GetInstance();

            Assert.AreSame(instance, instance2);

            //OR:
            Assert.That(instance,Is.SameAs(instance2));
        }
    }
}
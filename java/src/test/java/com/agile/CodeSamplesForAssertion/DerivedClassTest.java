package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DerivedClassTest {

    @Test
    public void ShouldBeAnInstanceOfAnimal() {

        DerivedClass derivedClass = DerivedClass.getInstance();

        
        assertEquals(true, derivedClass instanceof Animal);

        //OR
        assertThat(derivedClass, instanceOf(Animal.class));

    }

    @Test
    public void ShouldHaveSameInstanceEveryTime() {
        DerivedClass derivedClass1 = DerivedClass.getInstance();

        DerivedClass derivedClass2 = DerivedClass.getInstance();

        assertEquals(derivedClass1, derivedClass2);

        //OR
        assertThat(derivedClass1, is(derivedClass2));
    }
   
}
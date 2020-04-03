package com.agile.CodeSamplesForAssertion;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ClassWithExceptionsTest {

    @Test(expected = NullPointerException.class)
    public void ThrowsExceptionWhenNameIsNull() throws Exception
        {
            ClassWithExceptions cwe = new ClassWithExceptions();
            String result =  cwe.sayHello(null);
            result.length();
           
        }
        

    @Test
    public void ShouldHaveValidMessageForExceptionWhenNameIsNull() throws Exception
    {
        String result="";
        try
    {
        ClassWithExceptions cwe = new ClassWithExceptions();
        result = cwe.sayHello("null");
    }
    catch( final NullPointerException e )
    {
        final String msg = "Name is Null";
        result.length();
        assertEquals(msg, e.getMessage());
    }
}


    @Test
    public void shouldReturnMessageWhenTheValidStringPassed() throws Exception
        {
            ClassWithExceptions cwe = new ClassWithExceptions();
             String result =  cwe.sayHello("abc");
            assertEquals("Hello abc",result);
           
        }
    


}
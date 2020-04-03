package com.agile.CodeSamplesForAssertion;


public class ClassWithExceptions {

	public String sayHello(String name) throws Exception{
		if (name == null)
            {
                throw new NullPointerException("Name is Null");
            }
            return "Hello " + name;

	}

}

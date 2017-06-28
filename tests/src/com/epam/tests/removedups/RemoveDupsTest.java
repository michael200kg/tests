package com.epam.tests.removedups;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDupsTest extends Assert {

  class TestValues {
	  private String testValue;
	  private String resultValue;
	
	  public TestValues(String testValue, String resultValue) {
		 this.testValue = testValue;
		 this.resultValue = resultValue;
	  }

	public String getTestValue() {
		return testValue;
	}

	public String getResultValue() {
		return resultValue;
	}

	  
  }	
  
  private TestValues[] testStrings = { new TestValues("aaabbbccc","3a3b3c"),
		                               new TestValues("absjrnd","absjrnd"),
		                               new TestValues("aaaaaa","6a"), 
		                               new TestValues("aaasdjjjermmm","3asd3jer3m"), 
                                       new TestValues("as","as"),
                                       new TestValues("wedaa","wed2a"),
                                       new TestValues("wedaaw","wed2aw"),
                                       new TestValues(null,null),
                                       new TestValues("a","a") };	

	
@Before
public void beforeTest() {}

@Test
public void test() {
	Arrays.stream(testStrings).forEach(testValue->assertEquals(testValue.getTestValue()+": Not Passed",(new RemoveDups()).remove(testValue.getTestValue()),testValue.getResultValue()));
	Arrays.stream(testStrings).forEach(testValue->assertEquals(testValue.getTestValue()+": Not Passed",(new RemoveDups()).removeNew(testValue.getTestValue()),testValue.getResultValue()));
}


@After
public void afterTest() {
	testStrings=null;
}


	
}

package com.epam.tests.removedups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDupsTest extends Assert {

  private List<TestValues> testStrings;

  class TestValues {
	  private String testValue;
	  private String resultValue;
	
      TestValues(String testValue, String resultValue) {
		 this.testValue = testValue;
		 this.resultValue = resultValue;
	  }

	String getTestValue() {
		return testValue;
	}

	String getResultValue() {
		return resultValue;
	}

	  
  }	
  


	
@Before
public void beforeTest() {
	testStrings = new ArrayList<TestValues>(){{ add(new TestValues("aaabbbccc","3a3b3c"));
		                                        add(new TestValues("absjrnd","absjrnd"));
			                                    add(new TestValues("aaaaaa","6a"));
					                            add(new TestValues("aaasdjjjermmm","3asd3jer3m"));
					                            add(new TestValues("as","as"));
		                                        add(new TestValues("wedaa","wed2a"));
					                            add(new TestValues("wedaaw","wed2aw"));
					                            add(new TestValues(null,null));
					                            add(new TestValues("a","a")); } };

}

@Test
public void test() {
	testStrings.forEach(testValue->assertEquals(testValue.getTestValue()+": Not Passed",(new RemoveDups()).remove(testValue.getTestValue()),testValue.getResultValue()));
	testStrings.forEach(testValue->assertEquals(testValue.getTestValue()+": Not Passed",(new RemoveDups()).removeNew(testValue.getTestValue()),testValue.getResultValue()));
}


@After
public void afterTest() {
	testStrings=null;
}


	
}

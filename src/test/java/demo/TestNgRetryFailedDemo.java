package demo;

import org.testng.annotations.Test;

import listeners.RetryAnalyser;

public class TestNgRetryFailedDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		int i=1/0;
	}
	
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void test3() {
		System.out.println("I am inside Test 3");
		int i=1/0;

	}

}

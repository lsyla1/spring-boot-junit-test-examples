package com.junitexamples.junitexamples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

import java.time.YearMonth;


import java.util.ArrayList;
import com.junitexamples.Credential;
import com.junitexamples.Vector;
import com.junitexamples.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitExamplesApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void compareAfterFilteringInvalidEmails() throws Exception {
		
		ArrayList<String> emailsToTest = new ArrayList<String>();
			emailsToTest.add("a@b.com");
			emailsToTest.add("invalid@test");
			emailsToTest.add("+%^+%^+%@^%^&+%&+%&");
			emailsToTest.add("a@1234&/.com");
			emailsToTest.add("a@z'^+.com");
			
		Credential credential = new Credential();
			emailsToTest = credential.removeInvalidEMails(emailsToTest);
		
		ArrayList<String> resultsToTest = new ArrayList<String>();
			resultsToTest.add("a@b.com");
		
		assertEquals(emailsToTest, resultsToTest);
		
	}
	
	@Test
	public void compareAfterMultiplication() throws Exception{
		
			int[] firstVector  = {1,2,3};
			int[] secondVector = {4,5,6};
			
			/*
			 * Vector multiplication:
			 */
			Vector vector = new Vector();
				int[][] multiplication = vector.multiplication(firstVector, secondVector);	
			
			int[][] resultExpectation = {{4, 5, 6}, {8, 10, 12}, {12, 15, 18}};
			
			assertArrayEquals(multiplication,resultExpectation);
			
		
	}
	
	@Test
	public void assertTrueForFibonacciResults() {
		
		Vector vector = new Vector();
			int[] fibonacciSeries = vector.fibonacci(10);

			// Is 34 among first 10 fibonacci numbers?
			boolean contains = IntStream.of(fibonacciSeries).anyMatch(x -> x == 34);

			
			assertTrue(contains);
			
	}
	
	@Test
	public void assertFalseForFibonacciResults() {
		
		Vector vector = new Vector();
			int[] fibonacciSeries = vector.fibonacci(20);

			// Is 2353 among first 20 fibonacci numbers?
			boolean contains = IntStream.of(fibonacciSeries).anyMatch(x -> x == 2353);

			
			assertFalse(contains);
			
	}
	
	@Test
	public void assertAccountObjectIsNotNull() {
		
		Account accountObj = new Account();
				accountObj.firstName = "John";
				accountObj.lastName  = "Doe";
				accountObj.email     = "john@doe.com";
		
			assertNotNull(accountObj);
		
	}

	@Test
	public void assertAccountObjectsAreNotSame() {
		
		Account accountObj1 = new Account();
		Account accountObj2 = new Account();
		
			assertNotSame(accountObj1, accountObj2);
		
	}
	
	@Test
	public void assumeTestRunsThisCentury() {
		
		int year = YearMonth.now().getYear();
		
		boolean areWeStillOn21stCentury = (year < 2100);
		
		assumeTrue(areWeStillOn21stCentury);
		
		// So if this tests run after 2100, this assumption will halt the remaining tests.
		
	}
	
}

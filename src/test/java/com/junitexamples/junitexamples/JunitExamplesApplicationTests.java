package com.junitexamples.junitexamples;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import com.junitexamples.Credential;

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
			int[][] multiplication = new int[firstVector.length][secondVector.length];
			for(int i = 0; i < firstVector.length; i++) {
			    for(int j = 0; j < secondVector.length; j++){
			    	multiplication[i][j] = firstVector[i] * secondVector[j];
			    }
			}
			
			int[][] resultExpectation = {{4, 5, 6}, {8, 10, 12}, {12, 15, 18}};
			
			assertArrayEquals(multiplication,resultExpectation);
			
		
	}

}

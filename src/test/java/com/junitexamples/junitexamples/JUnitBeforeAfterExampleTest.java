package com.junitexamples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import java.util.ArrayList;
import com.junitexamples.Credential;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.matchers.JUnitMatchers.hasItems;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.junitexamples.Account;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JUnitBeforeAfterExampleTest.class})
public class JUnitBeforeAfterExampleTest {

	public static void main(String args[]){
		
	}
	
	@BeforeClass
	public static void beforeClassHook() {
		System.out.println("@BeforeClass - This runs before test class");
	}
	
		@Before
		public void beforeTestHook() {
			System.out.println("@Before - This runs before test method");			
		}
		
			@Test
			public void SimpleAssertTest() {
				
				ArrayList<String> emailsToTest = new ArrayList<String>();
					emailsToTest.add("a@b.com");
					emailsToTest.add("invalid@test");
					emailsToTest.add("+%^+%^+%@^%^&+%&+%&");
					emailsToTest.add("a@1234&/.com");
					emailsToTest.add("a@z'^+.com");
					
				Credential credential = new Credential();
					emailsToTest = credential.removeInvalidEMails(emailsToTest);
					
					assertThat(emailsToTest, hasItems("a@b.com"));
			}
		
		@After
		public void afterTestHook() {
			System.out.println("@After - This runs after test method");			
		}
	
	@AfterClass
	public static void afterClassHook() {
		System.out.println("@AfterClass - This runs after test class");
	}
	
}

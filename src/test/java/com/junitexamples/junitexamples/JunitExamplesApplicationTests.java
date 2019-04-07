package com.junitexamples.junitexamples;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import com.junitexamples.EmailValidator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitExamplesApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void compareAfterRemovingInvalidEmails() throws Exception {
		
		ArrayList<String> emailsToTest = new ArrayList<String>();
			emailsToTest.add("a@b.com");
			emailsToTest.add("x");
			
		EmailValidator emailValidator = new EmailValidator();
			emailsToTest = emailValidator.removeInvalidEMails(emailsToTest);
		
		ArrayList<String> resultsToTest = new ArrayList<String>();
			resultsToTest.add("a@b.com");
		
		assertEquals(emailsToTest, resultsToTest);
		
	}

}

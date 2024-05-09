package sit707_week2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit test class for Main
 */
public class MainTest {
	
	public MainTest() {
		System.out.println("MainTest");
	}
	
	@Before
	public void setup() {
		System.out.println("Before...");
	}
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222332999";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "ameet";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	 @Test
	    public void testLoginWithValidCredentials() {
	        String username = "your_username";
	        String password = "your_password";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertTrue("Successful login expected", result);
	    }

	    @Test
	    public void testInvalidUsername() {
	        String username = "invalid_username";
	        String password = "your_password";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertFalse("Failed login expected", result);
	    }

	    @Test
	    public void testInvalidPassword() {
	        String username = "your_username";
	        String password = "invalid_password";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertFalse("Failed login expected", result);
	    }

	    @Test
	    public void testEmptyUsername() {
	        String username = "";
	        String password = "your_password";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertFalse("Failed login expected", result);
	    }

	    @Test
	    public void testEmptyPassword() {
	        String username = "your_username";
	        String password = "";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertFalse("Failed login expected", result);
	    }

	    @Test
	    public void testEmptyUsernameAndPassword() {
	        String username = "";
	        String password = "";
	        boolean result = SeleniumOperations.loginToBunnings(username, password);
	        assertFalse("Failed login expected", result);
	    }
	
	}

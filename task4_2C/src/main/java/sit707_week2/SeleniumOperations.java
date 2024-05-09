package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations {

    public static boolean loginToBunnings(String username, String password) {
        // Set up WebDriver with specific ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavish Computers\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to login page
            driver.get("https://www.bunnings.com.au/login");

            // Find username field and enter username
            WebElement usernameField = driver.findElement(By.id("okta-signin-username"));
            usernameField.sendKeys(username);

            // Find password field and enter password
            WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
            passwordField.sendKeys(password);

            // Click on Sign In button
            WebElement signInButton = driver.findElement(By.id("okta-signin-submit"));
            signInButton.click();

            // Wait for page to load
            sleep(5);

            // Check if login was successful
            String currentUrl = driver.getCurrentUrl();
            return currentUrl.contains("bunnings.com.au/myaccount");
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
            return false;
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

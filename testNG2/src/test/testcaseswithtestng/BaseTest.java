package testcaseswithtestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("Launching browser.");
	}
	
	@BeforeTest
	public void openUrl() {
		System.out.println("Opening url.");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login into application.");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from application.");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
}

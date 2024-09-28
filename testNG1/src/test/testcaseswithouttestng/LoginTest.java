package testcaseswithouttestng;

import pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test (description = "Verify login with valid credentials", priority = 1, groups = {"P1"})
	public void verifyValidCrds() {

		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}

	@Test (description = "Verify login with invalid credentials", priority = 2, groups = {"P2"})
	public void verifyInValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin123");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
}

package testcaseswithtestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Optional;

import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	@Parameters ({"ValidUserName", "ValidPassword"})
	public void verifyValidCrds(@Optional("admin123")String ValidUserName ,@Optional("admin123") String ValidPassword) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(ValidUserName);
		loginPage.enterPassword(ValidPassword);
		loginPage.clickBtnLogin();
	}
	
	
	@Test
	@Parameters({"InvalidUserName","InvalidPassword"})
	public void verifyInValidCrds(@Optional("admin123") String InvalidUserName ,@Optional("admin123") String InvalidPassword) {
			LoginPage loginPage = new LoginPage();
			loginPage.enterUserName(InvalidUserName);
			loginPage.enterPassword(InvalidPassword);
			loginPage.clickBtnLogin();
	}
}

//SOLUTION BYTE
/*
public class LoginTest extends BaseTest{

	@Test
	@Parameters({"validUserName","validPassword"}) // M2
	public void verifyValidCrds(String validUserName, String validPassword) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(validUserName);
		loginPage.enterPassword(validPassword);
		loginPage.clickBtnLogin();
	}
	
	@Test
	@Parameters({"InvalidUserName","InvalidPassword"})
	public void verifyInValidCrds(@Optional("admin123") String InvalidUserName ,@Optional("admin123") String InvalidPassword) {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(InvalidUserName);
		loginPage.enterPassword(InvalidPassword);
		loginPage.clickBtnLogin();
	}
}
 */

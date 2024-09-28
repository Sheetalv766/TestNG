package testcaseswithtestng;

import org.testng.annotations.Test;

import pages.HelpPage;

public class HelpTest extends BaseTest {

	@Test
	public void verifyContactUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("Contact Us");
	}
	
	@Test
	public void verifyAboutUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("About Us");
	}

}

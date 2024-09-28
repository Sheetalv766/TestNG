package testcaseswithouttestng;

import pages.SearchPage;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
	
	@Test (description = "Verify searching for a particular product in specified category works")
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}

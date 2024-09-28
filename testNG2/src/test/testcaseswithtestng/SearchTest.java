package testcaseswithtestng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import pages.SearchPage;

public class SearchTest extends BaseTest {
	@Test (dataProvider = "My-Test-data-provider")
	public void verifySearchProduct(String productName) {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct(productName);
	}

		@DataProvider(name = "My-Test-data-provider")
		public Object[][] dpMethod() {
			return new Object[][] {{"iPhone-6"}, {"iPhone-7"}, {"iPhone-8"}, {"iPhone-XS"},
					{"iPhone-11"}, {"iPhone-12"}, {"iPhone-13"}, {"iPhone-14"}};
		}
	}

//SOLUTION BYTE
/*
public class SearchTest extends BaseTest {
	// M3
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "iPhone-6" }, { "iPhone-7" }, { "iPhone-8" }, { "iPhone-X" }, { "iPhone-11" },
				{ "iPhone-12" }, { "iPhone-13" }, { "iPhone-14" } };
	}

	@Test(dataProvider = "data-provider")
	public void verifySearchProduct(String val) {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct(val);
	}

	// @Test
	// public void verifySearchProduct() {
	// SearchPage searchPage = new SearchPage();
	// searchPage.searchProduct("Iphone-13");
	// }
}
 */

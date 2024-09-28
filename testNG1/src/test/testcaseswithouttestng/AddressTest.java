package testcaseswithouttestng;


import pages.AddressPage;

import org.testng.annotations.Test;

public class AddressTest extends BaseTest {

	@Test (description = "Verify adding delivery address functionality")
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
	}

	@Test (description = "Verify editing existing delivery address functionality")
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
}

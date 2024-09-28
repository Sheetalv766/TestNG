package testcaseswithtestng;

import pages.AddressPage;
import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// package includes :
import org.testng.asserts.SoftAssert;

@Listeners(ListenersTestNG.class)
public class AddressTest extends BaseTest {
	@Test
	@Parameters({"location"})
	public void verifyAddingAddress(String location) {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress(location);

		//plant a failure 
		Assert.assertTrue(false, "Planted failure to test Listeners");

		// // verify address , expected vs actual
		// // Type of assert Statement ---> Soft Assert
		// SoftAssert sA = new SoftAssert();

		// // CONDITION : Assert if addressPage.getAddress() returns "Pune"
		// sA.assertEquals(addressPage.getAddress(), "Pune", "don't match in the address");

		// // sA.assertAll();
	}

}

//SOLUTION BYTE

/*
// @Listeners(ListenersTestNG.class)
public class AddressTest extends BaseTest {

	@Test
	// M2
	@Parameters({ "location" })
	public void verifyAddingAddress(String location) {
		// public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress(location);

		// M1
		SoftAssert sa = new SoftAssert();
		// sa.assertEquals(addressPage.getAddress(), "Pune", "mismatch in the address");

		// M2
		sa.assertEquals(addressPage.getAddress(), location, "mismatch in the address");

		// M4
		Assert.assertTrue(false, "Planted failure to test Listeners");
	}
}
 */

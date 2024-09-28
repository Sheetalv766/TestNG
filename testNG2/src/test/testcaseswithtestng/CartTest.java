package testcaseswithtestng;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends BaseTest{
	
	@Test
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhone-13");
	}
	
	@Test
	@Parameters({"phone"})
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();

		//Type of assert Statement ---> Hard Assert
		//CONDITION : Assert if cartpage.prdRetainsInCart(); returns true
		Assert.assertTrue(cartpage.prdRetainsInCart());
		// System.out.println("Afetr assert statement");
	}
	
}






//SOLUTION BYTE
/*

public class CartTest extends BaseTest{
	// M2
	@Test
	@Parameters({"productName"})
	public void verifyMovingPrdToWishList(String productName) {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList(productName);
	}
	
	// @Test
	// public void verifyMovingPrdToWishList() {
	// 	CartPage cartpage = new CartPage();
	// 	cartpage.moveProductToWishList("IPhone-13");
	// }

	@Test
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		//cartpage.prdRetainsInCart();
		// M1
		Assert.assertTrue(cartpage.prdRetainsInCart());
	}
}
 */

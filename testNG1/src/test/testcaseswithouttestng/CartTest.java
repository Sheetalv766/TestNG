package testcaseswithouttestng;

import pages.CartPage;

import org.testng.annotations.Test;

public class CartTest extends BaseTest{

	@Test (description = "Verify moving product from a cart to wishlist")
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhone-13");
	}
	
	@Test (description = "Verify add to cart retains the item added after logout")
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}

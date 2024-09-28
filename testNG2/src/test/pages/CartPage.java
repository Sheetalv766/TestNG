package pages;

public class CartPage {
	
	public void moveProductToWishList(String productName) {
		System.out.println("Adding product to wish list : "+productName);
	}

	public boolean prdRetainsInCart() {
		System.out.println("Product present in cart");
		return true;
	}
}

package testcaseswithtestng;

import org.testng.annotations.Test;

import pages.ProductReviewPage;

public class ProductReviewTest extends BaseTest{

	@Test
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}
	
	@Test
	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}

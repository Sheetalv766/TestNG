package testcaseswithouttestng;

import pages.ProductReviewPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductReviewTest extends BaseTest {

	@Test (description = "Verify adding review to the purchase product")
	@BeforeMethod
	public void verifyAddingReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.addProductReview("Good");
	}

	@Test (description = "Verify editing review for purchase product")
	@BeforeMethod
	public void verifyEditReview() {
		ProductReviewPage productReviewPage = new ProductReviewPage();
		productReviewPage.editProductReview("Excellent");
	}
}

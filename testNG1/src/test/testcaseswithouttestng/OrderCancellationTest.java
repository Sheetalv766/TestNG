package testcaseswithouttestng;



import pages.OrderCancellationPage;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest{
	
	@Test (description = "Verify the order cancellation functionality", priority = 1)
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");
	}

	@Test (enabled = false, description = "Verify the product return functionality", priority = 1, dependsOnMethods = "verifyProductCancellation")
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}

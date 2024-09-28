package testcaseswithouttestng;

import pages.OrderTrackingPage;

import org.testng.annotations.Test;

public class OrderTrackingTest extends BaseTest{

	@Test (description = "Verify the order tracking functionality ")
	public void verifyOrderTracking() {
		OrderTrackingPage orderTrackingPage = new OrderTrackingPage();
		orderTrackingPage.trackOrder("order_987684");
	}
}

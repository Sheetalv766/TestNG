package testcaseswithtestng;

import org.testng.annotations.Test;

import pages.OrderTrackingPage;

public class OrderTrackingTest extends BaseTest{
	
	@Test
	public void verifyOrderTracking() {
		OrderTrackingPage orderTrackingPage = new OrderTrackingPage();
		orderTrackingPage.trackOrder("order_987684");
	}
}

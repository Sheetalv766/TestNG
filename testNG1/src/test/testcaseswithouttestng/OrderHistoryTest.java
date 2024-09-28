package testcaseswithouttestng;

import pages.OrderHistoryPage;

import org.testng.annotations.Test;

public class OrderHistoryTest extends BaseTest {

	@Test (description = "Verify viewing the order history")
	public void viewOrderHistory() {
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
		orderHistoryPage.orderHistory("12");
	}
}

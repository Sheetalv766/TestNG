package testcaseswithtestng;

import org.testng.annotations.Test;

import pages.OrderHistoryPage;

public class OrderHistoryTest extends BaseTest{

	@Test
	public void viewOrderHistory() {
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
		orderHistoryPage.orderHistory("12");
	}
}

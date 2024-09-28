package testcaseswithtestng;



import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.OrderCancellationPage;

public class OrderCancellationTest extends BaseTest{
	
	@Test
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");

		//Type of assert Statement ---> Hard Assert
		//CONDITION : Assert if "order_987684" is part of orderCancellationPage.getCancelledOrders()
		Assert.assertTrue(orderCancellationPage.getCancelledOrders().contains("order_987684"));
	}
	
	@Test
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}
}

//SOLUTION BYTE
/*
public class OrderCancellationTest extends BaseTest{
	// M2
	@Test
	@Parameters({"OrderId"})
	public void verifyProductCancellation(@Optional("order_987684") String OrderId) {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation(OrderId);
	}
	
	// @Test
	// public void verifyProductCancellation() {
	// 	OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
	// 	orderCancellationPage.orderCancellation("order_987684");
	// 	// M1
	// 	Assert.assertTrue(orderCancellationPage.getCancelledOrders().contains("order_987684"));
	// }

	@Test
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
 */

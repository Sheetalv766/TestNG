package pages;

import java.util.ArrayList;
import java.util.List;

public class OrderCancellationPage {

	List<String> CancelledOrders = new ArrayList<String>();
	
	public void orderCancellation(String orderId) {
		CancelledOrders.add(orderId);
		System.out.println("Cancelling order : "+orderId);
	}
	
	public void returnOrder(String orderId) {
		System.out.println("Return order : "+orderId);
	}

	public List<String> getCancelledOrders()
	{
		return this.CancelledOrders;
	}

}

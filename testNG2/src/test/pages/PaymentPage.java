package pages;

import java.util.Map;

public class PaymentPage {
	Map<String,String> CreditCardDetails ;
	Map<String,String> DebitCardDetails ;

	public void launchBrowser() {
		System.out.println("Launching browser.");
	}
	
	public void openUrl() {
		System.out.println("Opening url.");
	}
	
	public void payByCreditCard(Map<String,String> cardDetails) {
		this.CreditCardDetails = cardDetails;
		System.out.println("Entering card number : "+cardDetails.get("cardNumber"));
		System.out.println("Entering expire date : "+cardDetails.get("cardExpire"));
		System.out.println("Entering cvv : " +cardDetails.get("cvv"));
		System.out.println("Entering amount : " +cardDetails.get("amount"));
		System.out.println("Payment done successfully.");
	}
	
	public void payByDebitCard(Map<String,String> cardDetails) {
		this.DebitCardDetails=cardDetails;
		System.out.println("Entering card number : "+cardDetails.get("cardNumber"));
		System.out.println("Entering expire date : "+cardDetails.get("cardExpire"));
		System.out.println("Entering cvv : " +cardDetails.get("cvv"));
		System.out.println("Entering amount : " +cardDetails.get("amount"));
		System.out.println("Payment done successfully.");
	}
	
	public void payByAmazonPayLater(String amount) {
		System.out.println("Entering amount : " +amount);
		System.out.println("Payment done successfully.");
	}
	
	public Map<String,String> getCreditCardDetails(){
		return this.CreditCardDetails;
	}

	public Map<String,String> getDebitCardDetails(){
		return this.DebitCardDetails;
	}
}

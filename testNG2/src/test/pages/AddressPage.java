package pages;

public class AddressPage {
	String address;
	public void addAddress(String address) {
		this.address= address;
		System.out.println("Entering address : "+address);
	}
	
	public void editAddress(String address) {
		this.address= address;
		System.out.println("Entering address : "+address);
	}
	public String getAddress()
	{
		return this.address;
	}
	

}

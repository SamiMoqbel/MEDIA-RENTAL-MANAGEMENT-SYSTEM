package application;
import java.util.ArrayList;

public class Customer {
	private String customerName;
	private String customerAddress;
	ArrayList<Media> customerIntrestedInList = new ArrayList<Media>();
	ArrayList<Media> customerRentedList = new ArrayList<Media>();
	private String customerPlan;
	Cart cart=new Cart();
	private String customerID;
	private String customerMobile;
	
	public Customer() {
	}

	public Customer(String customerName, String customerAddress,String customerPlan,String customerID,String customerMobile) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPlan= customerPlan;
		this.customerID=customerID;
		this.customerMobile=customerMobile;
	}

	public String getcustomerPlan() {
		return customerPlan;
	}

	public void setcustomerPlan(String customerPlan) {
		this.customerPlan = customerPlan;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public ArrayList<Media> getCustomerIntrestedInList() {
		return customerIntrestedInList;
	}

	public void addToCustomerIntrestedIn(ArrayList<Media> customerIntrestedInList) {
		this.customerIntrestedInList = customerIntrestedInList;
	}
	
	public int getNumberOfRentedMedia() {
		int counter=0;
		for (int i = 0; i < customerRentedList.size(); i++) {
			counter++;
		}
		return counter;
	}

	public ArrayList<Media> getCustomerRentedList() {
		return customerRentedList;
	}

	public void addToCustomerRentedList(Media media) {
		if (media instanceof Movie) {
			customerRentedList.add((Movie)media);
		} else if (media instanceof Game) {
			customerRentedList.add((Game)media);
		} else {
			customerRentedList.add((Album)media);
		}
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	

}

package application;
import java.util.ArrayList;

public interface MediaRentalInt {
	void addCustomer(String name, String address, String plan,String customerID,String customerMobile);

	void addMovie(String title, int copiesAvailable, String rating,String code);

	void addGame(String title, int copiesAvailable, double weight,String code);

	void addAlbum(String title, int copiesAvailable, String artist, String songs,String code);

	void setLimitedPlanLimit(int value);

	String getAllCustomersInfo();
	String getAllMediaInfo();
	
	boolean addToCart(String customerName,String mediaTitle);
	boolean removeFromCart(String customerName, String mediaTitle);
	String processRequests();
	ArrayList<String> searchMedia(String title,String rating, String artist,String songs);
	
	boolean returnMedia(String customerName,String mediaTitle);
}

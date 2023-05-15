package application;
import java.util.ArrayList;

public class Cart {
	
//	Movie movie = new Movie();
//	Album album = new Album();
//	Game game = new Game();
	ArrayList<Media> mediaOfCustomerList= new ArrayList<Media>();

	public Cart() {

	}
	public void addMedia(Media media) {
		mediaOfCustomerList.add(media);
	}
	public void removeMedia(Media media) {
		mediaOfCustomerList.remove(media);
	}

	public ArrayList<Media> getMediaOfCustomerList() {
		return mediaOfCustomerList;
	}
}

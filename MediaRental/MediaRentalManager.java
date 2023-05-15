package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MediaRentalManager implements MediaRentalInt {
	private int planLimit = 2;
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Media> mediaList = new ArrayList<Media>();

	public void addCustomer(String name, String address, String plan,String customerID,String customerMobile) {
		customerList.add(new Customer(name, address, plan,customerID,customerMobile));
	}

	public void addMovie(String title, int copiesAvailable, String rating,String code) {
		mediaList.add(new Movie(title, copiesAvailable, rating,code));
	}

	public void addGame(String title, int copiesAvailable, double weight,String code) {
		mediaList.add(new Game(title, copiesAvailable, weight,code));
	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs,String code) {
		mediaList.add(new Album(title, copiesAvailable, artist, songs,code));
	}

	public void setLimitedPlanLimit(int value) {
		this.planLimit = value;
	}

	public String getAllCustomersInfo() {
		customerList.sort(new NameSorter());
		String allCustomerData = "";
		for (int i = 0; i < customerList.size(); i++) {
			allCustomerData = allCustomerData + "Customer (" + (i + 1) + "):\n";
			allCustomerData = allCustomerData + " Customer Name : " + customerList.get(i).getCustomerName();
			allCustomerData = allCustomerData + "\n Customer Address : " + customerList.get(i).getCustomerAddress();
			allCustomerData = allCustomerData + "\n Customer Plan: " + customerList.get(i).getcustomerPlan() + "\n";
		}
		return allCustomerData;
	}

	public String getAllMediaInfo() {
		mediaList.sort(new TitleSorter());
		String allMediaData = "";
		String movieData = "";
		String gameData = "";
		String albumData = "";
		for (int i = 0; i < mediaList.size(); i++) {
			if (mediaList.get(i) instanceof Movie) {
				Movie movieMedia = (Movie) mediaList.get(i);
				movieData = movieData + "Movie Title: " + movieMedia.getTitle() + "\n";
				movieData = movieData + "Movie Number Of Copies: " + movieMedia.getNumberOfCopies() + "\n";
				movieData = movieData + "Movie Rating: " + movieMedia.getMovieRating() + "\n";
				allMediaData += movieData + "==============\n";
			} else if (mediaList.get(i) instanceof Game) {
				Game gameMedia = (Game) mediaList.get(i);
				gameData = gameData + "Game Title: " + gameMedia.getTitle() + "\n";
				gameData = gameData + "Game Number Of Copies: " + gameMedia.getNumberOfCopies() + "\n";
				gameData = gameData + "Game Weight: " + gameMedia.getGameWeight() + "\n";
				allMediaData += gameData + "==============\n";
			} else {
				Album albumMedia = (Album) mediaList.get(i);
				albumData = albumData + "Album Title: " + albumMedia.getTitle() + "\n";
				albumData = albumData + "Album Number Of Copies: " + albumMedia.getNumberOfCopies() + "\n";
				albumData = albumData + "Album Song Artist: " + albumMedia.getSongArtist() + "\n";
				albumData = albumData + "Album Songs: " + albumMedia.getSongs() + "\n";
				allMediaData += albumData + "==============\n";
			}

		}

		return allMediaData;

	}

	public boolean addToCart(String customerName, String mediaTitle) {
		int indexOfCustomer = 0;
		int indexOfMedia = 0;
		boolean customerExist = true;
		boolean mediaExist = true;
		boolean mediaInCart = false;

		for (int i = 0; i < customerList.size(); i++) {
			if (customerName.compareToIgnoreCase(customerList.get(i).getCustomerName()) == 0) {
				indexOfCustomer = i;
//				System.out.println("Customer TEST!");
				customerExist = true;
				break;

			} else {
				customerExist = false;
			}
		}

		for (int i = 0; i < mediaList.size(); i++) {
			if (mediaTitle.compareToIgnoreCase(mediaList.get(i).getTitle()) == 0) {
				indexOfMedia = i;
//				System.out.println("MEDIA TEST!!");
				mediaExist = true;
				break;

			} else {
				mediaExist = false;
			}
		}

		for (int i = 0; i < customerList.get(indexOfCustomer).cart.mediaOfCustomerList.size(); i++) {
			if (customerList.get(indexOfCustomer).cart.mediaOfCustomerList.get(i).getTitle()
					.compareToIgnoreCase(mediaTitle) == 0) {
				mediaInCart = true;
				break;
			} else {
				mediaInCart = false;
			}
		}

		if (mediaExist == true && customerExist == true && mediaInCart == false) {
			if (customerList.get(indexOfCustomer).getcustomerPlan().compareToIgnoreCase("Limited") == 0
					&& customerList.get(indexOfCustomer).getNumberOfRentedMedia() < this.planLimit) {
//				System.out.println("Adding Limited TEST!!");
				customerList.get(indexOfCustomer).cart.addMedia(mediaList.get(indexOfMedia));
				return true;

			} else if (customerList.get(indexOfCustomer).getcustomerPlan().compareToIgnoreCase("Unlimited") == 0)
//				System.out.println("Adding UnLimited TEST!!");
				customerList.get(indexOfCustomer).cart.addMedia(mediaList.get(indexOfMedia));
			return true;
		}

//		System.out.println(indexOfCustomer);
//		System.out.println(indexOfMedia);

//		System.out.println(cart.getCustomer().getCustomerName());
//		System.out.println(cart.getMediaOfCustomerList().get(0).getTitle());
		return false;

	}

	public boolean removeFromCart(String customerName, String mediaTitle) {
		int indexOfCustomer = 0;
		int indexOfMedia = 0;
		boolean customerExist = true;
		boolean mediaExist = true;
		boolean mediaInCart = false;

		for (int i = 0; i < customerList.size(); i++) {
			if (customerName.compareToIgnoreCase(customerList.get(i).getCustomerName()) == 0) {
				indexOfCustomer = i;
//				System.out.println("removing Customer TEST!");
				customerExist = true;
				break;

			} else {
				customerExist = false;
			}
		}

		for (int i = 0; i < mediaList.size(); i++) {
			if (mediaTitle.compareToIgnoreCase(mediaList.get(i).getTitle()) == 0) {
				indexOfMedia = i;
//				System.out.println("removing MEDIA TEST!!");
				mediaExist = true;
				break;

			} else {
				mediaExist = false;
			}
		}

		for (int i = 0; i < customerList.get(indexOfCustomer).cart.mediaOfCustomerList.size(); i++) {
			if (customerList.get(indexOfCustomer).cart.mediaOfCustomerList.get(i).getTitle()
					.compareToIgnoreCase(mediaTitle) == 0) {
				mediaInCart = true;
				break;
			} else {
				mediaInCart = false;
			}
		}

		if (mediaExist == true && customerExist == true && mediaInCart == true) {
			customerList.get(indexOfCustomer).cart.removeMedia(mediaList.get(indexOfMedia));
//			System.out.println("removing MEDIA TEST!!");
		}

		return false;
	}

	public String processRequests() {
		String a = "";
		ArrayList<String> b = new ArrayList<>();
		customerList.sort(new NameSorter());
		for (int i = 0; i < customerList.size(); i++) {
//			System.out.println(customerList.get(i).getCustomerName());
			for (int k = 0; k < customerList.get(i).cart.mediaOfCustomerList.size(); k++) {
				if (customerList.get(i).getcustomerPlan().compareToIgnoreCase("Limited") == 0) {
					while (customerList.get(i).customerRentedList.size() < this.planLimit) {
						if (customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies() != 0) {
							customerList.get(i).customerRentedList
									.add(customerList.get(i).cart.mediaOfCustomerList.get(k));
							// System.out.println(customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies());
							customerList.get(i).cart.mediaOfCustomerList.get(k).deleteCopy();
							// System.out.println(customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies());
							b.add("Sending " + customerList.get(i).cart.mediaOfCustomerList.get(k).getTitle() + " to "
									+ customerList.get(i).getCustomerName());
							removeFromCart(customerList.get(i).getCustomerName(),
									customerList.get(i).cart.mediaOfCustomerList.get(k).getTitle());
						}
					}
				} else {
					while (customerList.get(i).cart.mediaOfCustomerList.size() != 0) {
						if (customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies() != 0) {
							customerList.get(i).customerRentedList
									.add(customerList.get(i).cart.mediaOfCustomerList.get(k));
							// System.out.println(customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies());
							customerList.get(i).cart.mediaOfCustomerList.get(k).deleteCopy();
							// System.out.println(customerList.get(i).cart.mediaOfCustomerList.get(k).getNumberOfCopies());
							b.add("Sending " + customerList.get(i).cart.mediaOfCustomerList.get(k).getTitle() + " to "
									+ customerList.get(i).getCustomerName());
							removeFromCart(customerList.get(i).getCustomerName(),
									customerList.get(i).cart.mediaOfCustomerList.get(k).getTitle());
						}
					}
				}

			}
		}
		for (int i = 0; i < b.size(); i++) {
			a = a + b.get(i);
		}
		return a;
	}

	public boolean returnMedia(String customerName, String mediaTitle) {
		int indexOfCustomer = 0;
		int indexOfMedia = 0;
		boolean customerExist = true;
		boolean mediaExist = true;

		for (int i = 0; i < customerList.size(); i++) {
			if (customerName.compareToIgnoreCase(customerList.get(i).getCustomerName()) == 0) {
				indexOfCustomer = i;
//				System.out.println("Customer TEST!");
				customerExist = true;
				break;

			} else {
				customerExist = false;
			}
		}

		for (int i = 0; i < mediaList.size(); i++) {
			if (mediaTitle.compareToIgnoreCase(mediaList.get(i).getTitle()) == 0) {
				indexOfMedia = i;
//				System.out.println("MEDIA TEST!!");
				mediaExist = true;
				break;

			} else {
				mediaExist = false;
			}
		}

		for (int i = 0; i < customerList.get(indexOfCustomer).getCustomerRentedList().size(); i++) {
			if (mediaExist == true && customerExist == true && mediaTitle.compareToIgnoreCase(
					customerList.get(indexOfCustomer).getCustomerRentedList().get(i).getTitle()) == 0) {
				customerList.get(indexOfCustomer).getCustomerRentedList().remove(mediaTitle);
				mediaList.get(indexOfMedia).addCopy();
//				System.out.println("Done!!!");
				break;
			} else
//				System.out.println("Sth WRONG!!!");
				return false;

		}

		return true;
	}

	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		ArrayList<String> listOfMedia = new ArrayList<String>();
		if (title != null) {
			// Movie Rating w/Title
			if (rating != null && artist == null && songs == null) {
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Movie) {
						Movie tempMovie = (Movie) mediaList.get(i);
						if (tempMovie.getMovieRating().compareToIgnoreCase(rating) == 0
								&& tempMovie.getTitle().compareToIgnoreCase(title) == 0) {
							listOfMedia.add(tempMovie.getTitle());
						}
					}
				}
			}
			// Artist W/Title
			else if (rating == null && artist != null && songs == null) {
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						if (tempAlbum.getSongArtist().compareToIgnoreCase(artist) == 0
								&& tempAlbum.getTitle().compareToIgnoreCase(title) == 0) {
							listOfMedia.add(tempAlbum.getTitle());
						}
					}
				}
			}
		} else if (title == null) {
			// All Null
			if (rating == null && artist == null && songs == null) {
				for (int i = 0; i < mediaList.size(); i++) {
					listOfMedia.add(mediaList.get(i).getTitle());
				}
			}
			// Movie rating
			else if (rating != null && artist == null && songs == null) {
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Movie) {
						Movie tempMovie = (Movie) mediaList.get(i);
						if (tempMovie.getMovieRating().compareToIgnoreCase(rating) == 0) {
							listOfMedia.add(tempMovie.getTitle());
						}
					}
				}
			}
			// Artist
			else if (rating == null && artist != null && songs == null) {
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						if (tempAlbum.getSongArtist().compareToIgnoreCase(artist) == 0) {
							listOfMedia.add(tempAlbum.getTitle());
						}
					}
				}
			} // Songs w/Title
			else if (rating == null && artist == null && songs != null) {
				String[] searchedSongs = songs.split(",");
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						for (int k = 0; k < searchedSongs.length; k++) {
							if (tempAlbum.getSongs().contains(searchedSongs[k]) == true) {
								listOfMedia.add(tempAlbum.getTitle());
							}
						}
					}
				}
			}
			// Songs w/Artist + Title
			else if (rating == null && artist != null && songs != null) {
				String[] searchedSongs = songs.split(",");
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						for (int k = 0; k < searchedSongs.length; k++) {
							if (tempAlbum.getSongs().contains(searchedSongs[k]) == true
									&& artist.compareToIgnoreCase(tempAlbum.getSongArtist()) == 0) {
								listOfMedia.add(tempAlbum.getTitle());
							}
						}
					}
				}
			}
			// Songs
			else if (rating == null && artist == null && songs != null) {
				String[] searchedSongs = songs.split(",");
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						for (int k = 0; k < searchedSongs.length; k++) {
							if (tempAlbum.getSongs().contains(searchedSongs[k]) == true) {
								listOfMedia.add(tempAlbum.getTitle());
							}
						}
					}
				}
			}
			// Songs w/Artist
			else if (rating == null && artist != null && songs != null) {
				String[] searchedSongs = songs.split(",");
				for (int i = 0; i < mediaList.size(); i++) {
					if (mediaList.get(i) instanceof Album) {
						Album tempAlbum = (Album) mediaList.get(i);
						for (int k = 0; k < searchedSongs.length; k++) {
							if (tempAlbum.getSongs().contains(searchedSongs[k]) == true
									&& artist.compareToIgnoreCase(tempAlbum.getSongArtist()) == 0) {
								listOfMedia.add(tempAlbum.getTitle());
							}
						}
					}
				}
			}
		}

		return listOfMedia;
	}

}

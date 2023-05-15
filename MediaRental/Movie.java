package application;
import java.util.ArrayList;

public class Movie extends Media // implements Comparable<>
{

	private String movieRating;

	public Movie(String movieTitle, int movieNumberOfCopies, String movieRating,String code) {
		super(movieTitle, movieNumberOfCopies,code);
		this.movieRating = movieRating;
	}

	public Movie() {

	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

}

package application;

public class Album extends Media // implements Comparable<>
{

	private String songArtist;
	private String songs;

	public Album() {

	}

	public Album(String songTitle, int songNumberOfCopies, String songArtist, String songs,String code) {
		super(songTitle, songNumberOfCopies,code);
		this.songArtist = songArtist;
		this.songs = songs;
	}

	public String getSongArtist() {
		return songArtist;
	}

	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}

}

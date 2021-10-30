/*This class collects methods/data for a song.*/
public class Song {

	private String songTitle;
	private String songArtist;
	private int count;
	
	/*
	 * Construct a new instance of the Song class with the specified song
	 * title and artist
	 */
	public Song(String title, String artist) {
		songTitle = title;
		songArtist = artist;
		count = 0;
	}
	
	//Return the title of the song
	public String getTitle() {
		return songTitle;
	}
	
	//Return the artist of the song
	public String getArtist() {
		return songArtist;
	}
	
	//Return the number of times this song has been played
	public int getTimesPlayed() {
		return count;
	}
	
	//"Play" this song. To play a song you just print out a description
	public void play() {
		System.out.println(toString());
		count++;
	}
	
	/*
	 * Return a string description of this song. It should be of the 
	 * formal: title by artist, timesPlayed play(s). So if you have 
	 * the song God's Plan by Drake and it has been played 27 times,
	 * it should return "God's Plan by Drake, 27 play(s)"
	 */
	public String toString() {
		return songTitle + " by " + songArtist + ", " + count + " play(s)";
	}
	
}
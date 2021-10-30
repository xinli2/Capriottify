import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * This class must keep track of the library of songs in your Spotify program.
 * This comes from the file in songFiles. That filename is passed in as a
 * command-line argument.
 */
public class Library {
	
	private List<Song> songLibrary;
	
	//Constructs a new instance of this class
	public Library() {
		songLibrary = new ArrayList<Song>();
	}
	
	/*
	 * Returns the Song associated with the String title passed in if it exists
	 * in the library, or null if the song does not exist in the library.
	 */
	public Song getSong(String title) {
		for (int i = 0; i < songLibrary.size(); i++) {
			if (title.equals(songLibrary.get(i).getTitle())) {
				return songLibrary.get(i);
			}
		}
		return null;
	}
	
	//Returns a list of all the songs in the library.
	public List<Song> getAllSongs() {
		return songLibrary;
	}
	
	//Adds the passed in song to library.
	public void addSong(Song song) {
		songLibrary.add(song);
	}
	
	//Removes the passed in song from the library if it exists in the library.
	public void removeSong(Song song) {
		songLibrary.remove(song);
	}
	
	/*
	 * Return a string representation of this library. The format is to have
	 * the string representation of each song on its own line. So you want to
	 * add the string representation of a song, then a newline for each song.
	 */
	public String toString() {
		List<String> sort = new ArrayList<String>();
		for (int i = 0; i < songLibrary.size(); i++) {
			sort.add(songLibrary.get(i).getTitle());
		}
		Collections.sort(sort);
		String result = "";
		for (int i = 0; i < sort.size(); i++) {
			for (int j = 0; j < songLibrary.size(); j++) {
				if (sort.get(i).equals(songLibrary.get(j).getTitle())) {
					result += songLibrary.get(j).toString() + "\n";
				}
			}
		}
		return result;
	}
}

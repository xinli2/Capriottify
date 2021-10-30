import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This class will keep track of a playlist.
public class Playlist {
	
	private String playlistName;
	private List<Song> playlistContents;


	//Constructs a new instance of the Playlist class with the specified name. 
	public Playlist(String name) {
		playlistName = name;
		playlistContents = new ArrayList<Song>();
	}
	
	/*
	 * Constrcts a new instance of the Playlist class with the specified name
	 * and songs.
	 */
	public Playlist(String name, List<Song> contents) {
		playlistName = name;
		playlistContents = contents;
	}
	
	//Returns the name of the playlist.
	public String getName() {
		return playlistName;
	}
	
	//Adds the specified song to the playlist. 
	public void addSong(Song song) {
		playlistContents.add(song);
	}
	
	/*
	 * Plays the playlist. In order to "play" a song, you just need to print
	 * each song out. Remember that a song already knows how to describe itself
	 * with its toString()method.
	 */
	public void play() {
		for (int i = 0; i < playlistContents.size(); i++) {
			playlistContents.get(i).play();
		}
	}
	
	/*
	 * Shuffle the songs in the playlist so they play in a different random
	 * order next time.
	 */
	public void shuffle() {
		Collections.shuffle(playlistContents);
	}
	
	//Remove the passed in song from the playlist if it exist in the playlist.
	public void removeSong(Song song) {
		playlistContents.remove(song);
	}
	
}

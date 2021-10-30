import java.util.ArrayList;
import java.util.List;

//This class bundles methods/ data for a User object.
public class User {
	
	private String userName;
	private String userPassword;
	private List<Playlist> userPlaylist;

	/*
	 * Constructs a new instance of the User class with the 
	 * specified name and password.
	 */
	public User(String name, String password) {
		userName = name;
		userPassword = password;
		userPlaylist = new ArrayList<Playlist>();
	}
	
	//Returns the name of the user.
	public String getName() {
		return userName;
	}
	
	/*
	 * Returns true if the password is valid for this user. 
	 * False otherwise.
	 */
	public boolean attemptLogin(String password) {
		if (password.equals(userPassword)) {
			return true;
		}
		return false;
	}
	
	//Adds the specified playlist to the user's playlists.
	public void addPlaylist(Playlist newPlaylist) {
		userPlaylist.add(newPlaylist);
	}
	
	//Returns a list of the playlists for this user.
	public List<Playlist> getPlaylists() {
		return userPlaylist;
	}
	
	/*
	 * Selects the playlist with the specified name if the 
	 * user has a playlist by that name and plays the newly 
	 * selected playlist.
	 */
	public void selectPlaylist(String name) {
		for (int i = 0; i < userPlaylist.size(); i++) {
			if (userPlaylist.get(i).getName().equals(name)) {
				userPlaylist.get(i).play();
				break;
			}
		}
	}
	
	/*
	 * Returns a string description of the user. The format 
	 * is name, numPlaylists playlist. So if I had a user
	 * cjenkins who had 12 playlists this method would return
	 * "cjenkins, 12 playlists".
	 */
	public String toString() {
		return userName + ", " + userPlaylist.size() + " playlists";
	}
	
}

import java.util.ArrayList;
import java.util.List;

//This class tracks all of the users in Spotify.
public class UserCollection {
	
	private List<User> userCollection;
	
	//Constructs a new instance of the UserCollection class.
	public UserCollection() {
		userCollection = new ArrayList<User>();
	}
	
	//Returns true if a user with the specified username exists.
	public boolean userExists(String username) {
		for (int i = 0; i < userCollection.size(); i++) {
			if (userCollection.get(i).getName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Returns the User associated with the login credentials if it
	 * was a valid login or returns null if the login was invalid.
	 */
	public User login(String username, String password) {
		for (int i = 0; i < userCollection.size(); i++) {
			if (userCollection.get(i).getName().equals(username)) {
				if (userCollection.get(i).attemptLogin(password)) {
					return userCollection.get(i);
				}
			}
		}
		return null;
	}
	
	//Adds this user to the collection of all users.
	public void addUser(User add) {
		userCollection.add(add);
	}
	
	/*
	 * Returns a string description of all the user. For example 
	 * if there were two user (tconkin, cjenkins) both with 0 
	 * playlists, toString() should return"{ cjenkins: cjenkins, 
	 * 0 playlists, tconklin: tconklin, 0 playlists,}"
	 */
	public String toString() {
		String result = "{ ";
		for (int i = 0; i < userCollection.size(); i++) {
			result += userCollection.get(i).getName() + ": " 
					+ userCollection.get(i).toString() + ", ";
		}
		result += "}";
		return result;
	}

}

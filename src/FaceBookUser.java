import java.util.List;
import java.util.UUID;

/*
 * represents the properties of a facebook user as seen by external APIs.
 */
public class FaceBookUser implements User {
	private UUID facebookId = UUID.randomUUID();
	private String userString;
	
	public FaceBookUser(String userName) {
		this.userString = userName.toString();
	}

	@Override
	public UUID getGuid() {
		return this.facebookId;
	}

	@Override
	public void setGuid(UUID guid) {
		this.facebookId = guid;
	}

	@Override
	public String getUserName() {
		return null;
	}

	@Override
	public FaceBookUser setUserName(String userName) {
		this.userString = userName;
		return this;
	}
	
	public UUID getFacebookId() {
		return this.facebookId;
	}

	@Override
	public String toString() {
		return "facebookId: " + this.facebookId + "\r\n" +
						  "facebook username: " + this.userString + "\r\n";
	}

	@Override
	public List<User> getExternalAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
}

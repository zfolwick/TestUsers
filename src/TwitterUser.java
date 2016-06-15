import java.util.List;
import java.util.UUID;

public class TwitterUser implements User {
	private UUID twitterId = UUID.randomUUID();
	private String userString;

	public TwitterUser(String userName) {
		this.userString = userName;
	}

	@Override
	public String toString() {
		return "twitterId: " + this.twitterId + "\r\n" +
			   "twitter username: " + this.userString + "\r\n";
	}

	@Override
	public UUID getGuid() {
		return this.twitterId;
	}

	@Override
	public void setGuid(UUID guid) {
		this.twitterId = guid;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User setUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getExternalAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
}

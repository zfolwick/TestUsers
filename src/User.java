import java.util.List;
import java.util.UUID;

/*
 * This is an interface for a basic user.  At the basic level, a user needs 
 * a guid and a username.
 */
public interface User {
	public UUID getGuid();
	public void setGuid(UUID guid);
	public String getUserName();
	public User setUserName(String userName);
	public String toString();
	public List<User> getExternalAccounts();
}

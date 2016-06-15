import java.util.*;
/*
 * This is a basic testable user, containing what is required to define
 * a user: a guid, and a username.
 */
public class TestableUser implements User {
	private UUID guid;
	private String userName;
	// all of the following are optional.  Consider adding them to a list of properties.
	private List<User> externalAccounts;
	private List<String> phoneNumbers;
	
	public TestableUser (String userName) {
		this.guid = UUID.randomUUID();
		this.userName = userName;
		externalAccounts = new ArrayList<User>();
		phoneNumbers = new ArrayList<String>();
	}

	@Override
	public UUID getGuid() {
		return this.guid;
	}

	@Override
	public void setGuid(UUID guid) {
		this.guid = guid;
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	
	@Override
	public String toString() {
		return "userGuid: " + this.guid + "\r\n" +
			   "userName: " + this.userName + "\r\n" +
			   "phone Number(s): " + this.phoneNumbers + "\r\n";
	}

	@Override
	public List<User> getExternalAccounts() {
		return this.externalAccounts;
	}
	
	public TestableUser attachAccount(User socialAccount) {
		externalAccounts.add(socialAccount);
		return this;
	}

	public User attachPhone(String phoneNumber) {
		//phone validation logic goes here
		phoneNumbers.add(phoneNumber);
		return this;
	}
}

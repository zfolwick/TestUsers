
public class UserMain {

	public static void main(String[] args) {
		// Creates a user and adds attributes via a fluent interface.
		/*
		 * We create a testable user, and to this user we add some attributes
		 * at runtime.  User A might be a fb user, user b might be a twitter user.
		 * user C might have facebook and some other user property enabled.  This is
		 * an easy interface to create a user in a single line of code.
		 * 
		 * I had thought a decorator pattern would work, however it became verbose and
		 * this was what I ended up with.
		 */
		
		User a = new TestableUser("fancy_user")
							.attachAccount( new TwitterUser("twitter_guy"))
							.attachAccount( new FaceBookUser("facebook_guy"))
							.attachPhone("555-124-1212");

		System.out.println(a.toString());
		System.out.println("\r\nprinting external accounts");
		System.out.println(a.getExternalAccounts().toString());
		
		/*
		 * Optional improvements:
		 * User a = new TestableUser("u_name")
		 * 					.attach<TwitterAccount>("twitter_username")
		 * 					.attach<FaceBookAccount>("facebook_username")
		 * 					.attach<Phone>(5554251212)
		 * 					.attach<anotherThing>(anInstanceOfthatThing);
		 */
	}
}

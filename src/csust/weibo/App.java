package csust.weibo;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {
		
		User u1 = new User("Amy");
		User u2 = new User("Alice");
		User u3 = new User("Bob");
		User u4 = new User("rose");
		User u5 = new User("Mark");
		
		u1.addFollowing(u5);
		u1.addFollowing(u3);
		u2.addFollowing(u5);
		u2.addFollowing(u3);
		u3.addFollowing(u5);
		u3.addFollowing(u2);
		u4.addFollowing(u5);
		u5.addFollowing(u1);
		u5.addFollowing(u4);
		
//		u1.showInfo();
//		u2.showInfo();
//		u3.showInfo();
//		u4.showInfo();
//		u5.showInfo();
//		System.out.println(m1.getTime());
		
		Message m1 = new Message("Hello, my name is Amy!");
		u1.send(m1);
		u1.send(new Message("today is friday"));
		u1.showInfo();
		u5.send(new Message("I'm happy"));
		u5.showInfo();
		

		u2.showInfo();
		u3.showInfo();
		u4.showInfo();
		

	}

}

package csust.weibo;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("alice"));
		list.add(new User("bob"));
		list.add(new User("amy"));
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
	}

}

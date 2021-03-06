package csust.weibo;

import java.util.ArrayList;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class User {

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 状态
	 */
	private ArrayList<Message> message = new ArrayList<>();

	/**
	 * 关注
	 */
	private ArrayList<User> following = new ArrayList<>();

	/**
	 * 粉丝
	 */
	private ArrayList<User> followers = new ArrayList<>();

	/**
	 * 构造方法
	 * 
	 * @param name
	 *            用户名
	 */
	public User(String name) {
		super();
		this.name = name;
	}

	public ArrayList<Message> getMessage() {
		return message;
	}

	public void setMessage(ArrayList<Message> message) {
		this.message = message;
	}

	public ArrayList<User> getFollowing() {
		return following;
	}

	public void setFollowing(ArrayList<User> following) {
		this.following = following;
	}

	public ArrayList<User> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}

	public String getName() {
		return name;
	}

	// 重写【不肖子孙】
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}

	/**
	 * 关注一个用户
	 * 
	 * @param user
	 *            被关注的对象
	 */
	public void addFollowing(User user) {
		// 你关注的参数对象 user
		following.add(user);
		// 你成了参数对象的粉丝
		user.followers.add(this);
	}

	/**
	 * 取消关注
	 * 
	 * @param user
	 *            取消关注的对象
	 */
	public void removeFollowing(User user) {
		following.remove(user);
		user.following.remove(this);
	}

	/**
	 * 获得你关注的人数
	 * 
	 * @return
	 */
	public int getFollowingSize() {
		return following.size();
	}
	
	/**
	 * 获得粉丝数
	 * 
	 * @return
	 */
	public int getFollowersSize() {
		return followers.size();
	}

	/**
	 * 打印信息
	 */
	public void showInfo() {
		System.out.println(name);
		System.out.printf("关注: %d\t  %s\n",
				following.size(),following);
		System.out.printf("粉丝: %d\t  %s\n",
				followers.size(),followers);
		System.out.printf("消息[%d]: %s\n",
				message.size(),message);
		System.out.println("----------------------");
	}

	
	public void send(Message m) {
		m.setAuthor(this);
		message.add(m);	
	}
	
	
	
	
}

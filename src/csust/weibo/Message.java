package csust.weibo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

	private String content;
	private User author;
	private Date time;
	
	public Message(String content) {
		this.content = content;
		time = new Date();
	}

	public void setAuthor(User user) {
		author = user;
	}
	
	public User getAuthor() {
		return author;
	}

	public String getTime() {
		//return time.toLocaleString();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd HH:mm");
		return format.format(time);
	}
	
	
	@Override
	public String toString() {
		return String.format("[%s@%s: %s]", author.getName(),getTime(),content);
	}
	
	
}


public class AppNews implements Observer{
	private String userName;
	
	private Subject topic;
	
	public AppNews(String userName) {
		this.userName = userName;
	}
	
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this); 
		if(msg ==  null) {
			System.out.println("No update");
		}else {
			System.out.println("New: "+msg+ " -- to "+userName);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		topic = subject;
	}
	
}

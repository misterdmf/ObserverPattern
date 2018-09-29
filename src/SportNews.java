import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SportNews implements Subject{
	
	private List<Observer> observers;
	private String message;
	
	public SportNews() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs: observers) {
			obs.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return message;
	}
	
	public void postMessage(String msg) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		message = msg + " ## "+dtf.format(now);
		System.out.println("Sport news: "+msg);
		notifyObservers();
	}
	
}

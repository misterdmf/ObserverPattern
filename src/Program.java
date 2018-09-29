
public class Program {

	public static void main(String[] args) {
		SportNews topic = new SportNews();
		
		Observer ob1 = new AppNews("ob1");
		Observer ob2 = new AppNews("ob2");
		Observer ob3 = new AppNews("ob3");
		
		topic.register(ob1);
		topic.register(ob2);
		topic.register(ob3);
		
		ob1.setSubject(topic);
		ob2.setSubject(topic);
		ob3.setSubject(topic);
		
		ob1.update();
		
		topic.postMessage("Opa lele");
		
		ob1.update();
	}

}

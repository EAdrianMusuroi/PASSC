package EventBus;

import pipesAndFilters.Chair;

public class Client extends Subscriber {

	private int i;
	
	public Client(String name) {
		super(name);
		super.subscribe(new DONE_P(), this);
		i = 0;
	}
	
	public void operate(Chair c) {
		i++;
		System.out.println("Seat number: " + i);
		System.out.println(c);
	}
	
	public void publish(Chair c) {
		DONE_S e = new DONE_S();
		e.setChair(c);
		this.send(e);
	}
}

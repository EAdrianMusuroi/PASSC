package EventBus;

import pipesAndFilters.Chair;

public class SeatWorker extends Subscriber{

	public SeatWorker(String name) {
		super(name);
		super.subscribe(new DONE_D(), this);
	}
	
	public void operate(Chair c) {
		c.addSeat();
		publish(c);
	}
	
	public void publish(Chair c) {
		DONE_C e = new DONE_C();
		e.setChair(c);
		this.send(e);
	}
}

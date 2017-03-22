package EventBus;

import pipesAndFilters.Chair;

public class FeetWorker extends Subscriber{

	public FeetWorker(String name) {
		super(name);
		super.subscribe(new DONE_C(), this);
	}
	
	public void operate(Chair c) {
		c.addFeet();
		publish(c);
	}
	
	public void publish(Chair c) {
		DONE_F e = new DONE_F();
		e.setChair(c);
		this.send(e);
	}
}

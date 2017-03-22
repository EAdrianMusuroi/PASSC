package EventBus;

import pipesAndFilters.Chair;

public class BackrestWorker extends Subscriber {

	public BackrestWorker(String name) {
		super(name);
		super.subscribe(new DONE_F(), this);
	}
	
	public void operate(Chair c) {
		c.addBackrest();
		publish(c);
	}
	
	public void publish(Chair c) {
		DONE_B e = new DONE_B();
		e.setChair(c);
		this.send(e);
	}
}

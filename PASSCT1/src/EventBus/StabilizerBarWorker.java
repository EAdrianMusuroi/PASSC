package EventBus;

import pipesAndFilters.Chair;

public class StabilizerBarWorker extends Subscriber{

	public StabilizerBarWorker(String name) {
		super(name);
		super.subscribe(new DONE_B(), this);
	}
	
	public void operate(Chair c) {
		c.addStabilizerBar();
		publish(c);
	}
	
	public void publish(Chair c) {
		DONE_S e = new DONE_S();
		e.setChair(c);
		this.send(e);
	}
}

package EventBus;

import pipesAndFilters.Chair;

public class PackageWorker extends Subscriber {

	public PackageWorker(String name) {
		super(name);
		super.subscribe(new DONE_S(), this);
	}
	
	public void operate(Chair c) {
		c.addPackage();
		publish(c);
	}
	
	public void publish(Chair c) {
		DONE_P e = new DONE_P();
		e.setChair(c);
		this.send(e);
	}
}

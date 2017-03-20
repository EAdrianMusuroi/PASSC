package pipesAndFilters;

import java.util.concurrent.BlockingQueue;

public class FeetWorker extends Worker {
	
	public FeetWorker(String name, BlockingQueue<Chair> i, BlockingQueue<Chair> o) {
		
		super(name, i, o);
		this.delay = 40;
	}
	
	public void operate(Chair c) {
		
		c.addFeet();
	}
}

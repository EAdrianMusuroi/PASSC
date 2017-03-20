package pipesAndFilters;

import java.util.concurrent.BlockingQueue;

public class BackrestWorker extends Worker {
	
	public BackrestWorker(String name, BlockingQueue<Chair> i, BlockingQueue<Chair> o) {
		
		super(name, i, o);
		this.delay = 15;
	}
	
	public void operate(Chair c) {
		
		c.addBackrest();
	}
}

package pipesAndFilters;

import java.util.concurrent.BlockingQueue;

public class StabilizerBarWorker extends Worker {

	public StabilizerBarWorker(String name, BlockingQueue<Chair> i, BlockingQueue<Chair> o) {
		
		super(name, i, o);
		this.delay = 20;
	}
	
	public void operate(Chair c) {
		
		c.addStabilizerBar();
	}
}

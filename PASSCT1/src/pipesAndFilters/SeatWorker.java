package pipesAndFilters;

import java.util.concurrent.BlockingQueue;

public class SeatWorker extends Worker {

	public SeatWorker(String name, BlockingQueue<Chair> i, BlockingQueue<Chair> o) {
		
		super(name, i, o);
		this.delay = 10;
	}
	
	public void operate(Chair c) {
		
		c.addSeat();
	}
}

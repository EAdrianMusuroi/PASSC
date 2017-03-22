package BlackBoard;

import pipesAndFilters.Chair;

public class SeatWorker extends Worker {

	public SeatWorker(String name, Blackboard bb) {
		
		super(name, bb);
		this.delay = 10;
	}
	
	public void operate(Chair c) {
		
		c.addSeat();
	}
	
	public boolean verifyCondition(Chair c) {
		
		return c.isSeat();
	}
}

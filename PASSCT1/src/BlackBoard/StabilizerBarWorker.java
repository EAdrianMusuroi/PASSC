package BlackBoard;

import pipesAndFilters.Chair;

public class StabilizerBarWorker extends Worker {

	public StabilizerBarWorker(String name, Blackboard bb) {
		
		super(name, bb);
		this.delay = 20;
	}
	
	public void operate(Chair c) {
		
		c.addStabilizerBar();
	}
	
	public boolean verifyCondition(Chair c) {
		
		return c.isStabilizerBar();
	}
}

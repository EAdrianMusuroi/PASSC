package BlackBoard;

import pipesAndFilters.Chair;

public class FeetWorker extends Worker {
	
	public FeetWorker(String name, Blackboard bb) {
		
		super(name, bb);
		this.delay = 40;
	}
	
	public void operate(Chair c) {
		
		c.addFeet();
	}
	
	public boolean verifyCondition(Chair c) {
		
		return c.isFeet();
	}
}

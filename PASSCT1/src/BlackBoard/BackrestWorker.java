package BlackBoard;

import pipesAndFilters.Chair;

public class BackrestWorker extends Worker {
	
	public BackrestWorker(String name, Blackboard bb) {
		
		super(name, bb);
		this.delay = 15;
	}
	
	public void operate(Chair c) {
		
		c.addBackrest();
	}
	
	public boolean verifyCondition(Chair c) {
		
		return c.isBackrest();
	}
}

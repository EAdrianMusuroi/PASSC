package BlackBoard;

import pipesAndFilters.Chair;

public class PackageWorker extends Worker {

	public PackageWorker(String name, Blackboard bb) {
		
		super(name, bb);
		this.delay = 10;
	}
	
	public void operate(Chair c) {
		
		c.addPackage();
	}
	
	public boolean verifyCondition(Chair c) {
		
		return c.isPackage();
	}
}

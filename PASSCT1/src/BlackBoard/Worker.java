package BlackBoard;

import pipesAndFilters.Chair;

public abstract class Worker implements Runnable {

	protected String name;
	protected long delay;
	protected Blackboard blackboard;

	public Worker(String name, Blackboard bb) {
		
		this.name = name;
		this.blackboard = bb;
	}
	
	protected abstract void operate(Chair c);
	protected abstract boolean verifyCondition(Chair c);
	
	public void run() {
		
		Chair c; 
		int i;
		
		try {
			while(true) {
				for(i = 0; i < 50; i++) {
					c = blackboard.getChairByKey(i);
					if(c != null) {
						if(this.verifyCondition(c) == false)
							this.operate(c);
					}
				}
				Thread.sleep(50);
				Thread.yield();
			}
		}
		catch(InterruptedException e) {
			System.out.println("Muncitorul " + name + " s-a oprit din munca.");
		}
	}
}
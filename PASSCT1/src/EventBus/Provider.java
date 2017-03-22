package EventBus;

import pipesAndFilters.Chair;

public class Provider {

	private EventBus eventBus;
	
	public Provider() {
		eventBus = EventBus.createInstance();
	}
	
	public void operate() {
		
		DONE_D delivered = new DONE_D();
		Chair c;
		
		c = new Chair();
		delivered.setChair(c);
		eventBus.publish(delivered);
		
	}
}

package EventBus;

import pipesAndFilters.Chair;

public abstract class Subscriber {
	
	private EventBus eventBus;
	protected String name;
	protected long delay;
	
	public Subscriber(String name) {
		
		eventBus = EventBus.createInstance();
		this.name = name;
	}
	
	public void notifyMe(Event event) {
		
		Chair c = event.getChair();
		this.operate(c);
	}
	
	protected void send(Event e) {
		eventBus.publish(e);
	}
	
	protected void subscribe(Event e, Subscriber s) {
		eventBus.subscribe(e, s);
	}
	
	public abstract void publish(Chair c);
	
	protected abstract void operate(Chair c);
}

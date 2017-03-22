package EventBus;

public class Subscription {
	
	private Subscriber subscriber;
	private Event event;
	
	public Subscription(Event event, Subscriber subscriber) {
		
		this.subscriber = subscriber;
		this.event = event;
	}
	
	public boolean isAddressable(Event event) {
		
		return this.event.equals(event);			
	}
	
	public void notifySubscriber(Event event) {
		
		this.subscriber.notifyMe(event);
	}
	
	public boolean equals(Object o) {
		
		if(o instanceof Subscription)
			if(this.subscriber.equals(((Subscription) o).subscriber) && this.event.equals(((Subscription) o).event))
				return true;
		
		return false;
	}
}

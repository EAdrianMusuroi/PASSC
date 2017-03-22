package EventBus;

import java.util.*;

public class EventBus {
	
	private static EventBus instance = null;
	private ArrayList<Subscription> subscriptions;
	//private Iterator<Subscription> iterator;
	
	private EventBus() {
		
		subscriptions = new ArrayList<Subscription>();
		//iterator = subscriptions.iterator();
	}
	
	public static EventBus createInstance() {
		
		if(instance == null)
			instance = new EventBus();
		
		return instance;
	}
	
	public void subscribe(Event event, Subscriber subscriber) {
		
		Subscription sub = new Subscription(event, subscriber);
		
		if(subscriptions.contains(sub))
			return;
		
		subscriptions.add(sub);
	}
	
	public void unsubscribe(Event event, Subscriber subscriber) {
		
		Subscription sub = new Subscription(event, subscriber);
		
		subscriptions.remove(sub);
	}
	
	public void publish(Event event) {
		
		Subscription sub;
		Iterator<Subscription> iterator = subscriptions.iterator();
		
		while(iterator.hasNext()) {
			sub = iterator.next();
			if(sub.isAddressable(event)) {
				sub.notifySubscriber(event);
				break;
			}
		}
	}
}

package pipesAndFilters;

import java.util.concurrent.*;

public class Provider implements Runnable{

	private BlockingQueue<Chair> queue;
	
	public Provider(BlockingQueue<Chair> q) {
		
		this.queue = q;
	}
	
	public void run() {
		
		Chair c;
		
		while(true) {
			
			try {
				c = new Chair();
				queue.put(c);
				Thread.yield();
			}
			catch(InterruptedException e) {
				
				System.out.println("Provider has been interrupted.");
				break;
			}
		}
	}
}

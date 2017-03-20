package pipesAndFilters;

import java.util.concurrent.*;

public class Client implements Runnable {

	private BlockingQueue<Chair> queue;
	private int i  = 0;
	
	
	public Client(BlockingQueue<Chair> q) {
		
		this.queue = q;
	}
	
	public void run() {
		
		Chair c;
		
		while(true) {
			
			try {
				
				c = queue.take();
				i++;
				System.out.println("Seat number " + i + ": " + c);
				Thread.yield();
				
			}
			catch(InterruptedException e) {
				
				System.out.println("Client has been interrupted.");
				break;
			}
		}
	}
}

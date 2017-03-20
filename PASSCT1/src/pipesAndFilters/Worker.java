package pipesAndFilters;

import java.util.concurrent.*;

public abstract class Worker implements Runnable {

	protected String name;
	protected long delay;
	protected BlockingQueue<Chair> inputQueue, outputQueue;

	public Worker(String name, BlockingQueue<Chair> i, BlockingQueue<Chair> o) {
		
		this.name = name;
		this.inputQueue = i;
		this.outputQueue = o;
	}
	
	protected abstract void operate(Chair c);
	
	public void run() {
		
		Chair c; 
		
		try {
			while(true) {
				c = inputQueue.take();
				this.operate(c);
				Thread.sleep(delay);
				outputQueue.put(c);
				Thread.yield();
			}
		}
		catch(InterruptedException e) {
			System.out.println("Muncitorul " + name + " s-a oprit din munca.");
		}
	}
}

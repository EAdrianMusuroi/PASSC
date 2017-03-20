package pipesAndFilters;

import java.util.concurrent.*;

public class Main {

	public static void main(String[] argv) {
		
		BlockingQueue<Chair> start = new LinkedBlockingQueue<Chair>(30);
		BlockingQueue<Chair> pipe1 = new LinkedBlockingQueue<Chair>(30);
		BlockingQueue<Chair> pipe2 = new LinkedBlockingQueue<Chair>(30);
		BlockingQueue<Chair> pipe3 = new LinkedBlockingQueue<Chair>(30);
		BlockingQueue<Chair> pipe4 = new LinkedBlockingQueue<Chair>(30);
		BlockingQueue<Chair> end = new LinkedBlockingQueue<Chair>(30);
		
		Worker ion, vasile, petru, gheo, costi;
		Provider sursa;
		Client destinatie;
		
		sursa = new Provider(start);
		destinatie = new Client(end);
		
		ion = new SeatWorker("Ion", start, pipe1);
		vasile = new FeetWorker("Vasile", pipe1, pipe2);
		petru = new BackrestWorker("Petru", pipe2, pipe3);
		gheo = new StabilizerBarWorker("Gheo", pipe3, pipe4);
		costi = new PackageWorker("Costi", pipe4, end);
		
		Thread t1 = new Thread(sursa); 
		t1.start();
		Thread t2 = new Thread(ion); 
		t2.start();
		Thread t3 = new Thread(vasile);
		t3.start();
		Thread t4 = new Thread(petru);
		t4.start();
		Thread t5 = new Thread(gheo);
		t5.start();
		Thread t6 = new Thread(costi);
		t6.start();
		Thread t7 = new Thread(destinatie);
		t7.start();
		
		try {
			Thread.sleep(5000);
			if(t1.isAlive())
				t1.interrupt();
			t2.interrupt();
			t3.interrupt();
			t4.interrupt();
			t5.interrupt();
			t6.interrupt();
			t7.interrupt();
			
			System.out.println(start.remainingCapacity() + " " + pipe1.remainingCapacity() + " " + pipe2.remainingCapacity() + " " + pipe3.remainingCapacity() + " " + pipe4.remainingCapacity() + " " + end.remainingCapacity());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}

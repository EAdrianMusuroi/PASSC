package BlackBoard;

public class Main {

	public static void main(String argv[]) {
		
		Blackboard bb = new Blackboard();
		Control control = new Control(bb);
		Worker ion, vasile, petru, gheo, costi;
		
		ion = new SeatWorker("Ion", bb);
		vasile = new FeetWorker("Vasile", bb);
		petru = new BackrestWorker("Petru", bb);
		gheo = new StabilizerBarWorker("Gheo", bb);
		costi = new PackageWorker("Costi", bb);
		
		Thread t1 = new Thread(control);
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
		
		try {
			Thread.sleep(5000);
			t1.interrupt();
			while(t1.isAlive()) {
				Thread.sleep(500);
			}
			t2.interrupt();
			t3.interrupt();
			t4.interrupt();
			t5.interrupt();
			t6.interrupt();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

package EventBus;

public class Main {

	public static void main(String[] argv) {
		
		Subscriber ion, vasile, petru, gheo, costi;
		Provider sursa;
		Client destinatie;
		
		sursa = new Provider();
		ion = new SeatWorker("Ion");
		vasile = new FeetWorker("Vasile");
		petru = new BackrestWorker("Petru");
		gheo = new StabilizerBarWorker("Gheo");
		costi = new PackageWorker("Costi");
		destinatie = new Client("OUTPUT");
		
		for(int i = 0; i < 50; i++)
			sursa.operate();
	}
}

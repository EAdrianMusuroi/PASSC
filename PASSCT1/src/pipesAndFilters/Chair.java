package pipesAndFilters;

public class Chair {

	private boolean seat;
	private boolean feet;
	private boolean backrest;
	private boolean stabilizerBar;
	private boolean packaged;
	
	public Chair() {
		
		seat = false;
		feet = false;
		backrest = false;
		stabilizerBar = false;
		packaged = false;
	}
	
	public void addSeat() {
		
		this.seat = true;
	}
	
	public boolean isSeat() {
		
		return this.seat;
	}
	
	public void addFeet() {
		
		this.feet = true;
	}
	
	public boolean isFeet() {
		
		return this.feet;
	}
	
	public void addBackrest() {
		
		this.backrest = true;
	}
	
	public boolean isBackrest() {
		
		return this.backrest;
	}
	
	public void addStabilizerBar() {
	
		this.stabilizerBar = true;
	}
	
	public boolean isStabilizerBar() {
		
		return this.stabilizerBar;
	}
	
	public void addPackage() {
		
		this.packaged = true;
	}
	
	public boolean isPackage() {
		
		return this.packaged;
	}
	
	public String toString() {
		
		return (seat ? "Seat" : "Defect seat") + 
				(feet ? " with feet" : " without feet") + 
				(backrest ? ", with backrest" : ", without backrest") +
				(stabilizerBar ? ", with stabilizer bar" : ", without stabilizer bar") +
				(packaged ? " and packaged." : " but not packaged.");
	}
}

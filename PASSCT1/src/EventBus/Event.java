package EventBus;

import pipesAndFilters.Chair;

public abstract class Event {
	
	private Chair chair;
	
	public void setChair(Chair c) {
		this.chair = c;
	}
	
	public Chair getChair() {
		
		return this.chair;
	}
	
	public boolean equals(Object o) {
		
		if(o.getClass().equals(this.getClass()))
			return true;
		
		return false;
	}
}

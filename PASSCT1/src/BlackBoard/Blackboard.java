package BlackBoard;

import java.util.Hashtable;

import pipesAndFilters.Chair;

public class Blackboard {
	
	private Hashtable<Integer, Chair> chairs;
	
	public Blackboard() {
		
		chairs = new Hashtable<Integer, Chair>(50);
	}
	
	public void fillBlackboard() {
		
		for(int i = 0; i < 50; i++)
			if(!chairs.containsKey(i))
				chairs.put(i, new Chair());
	}
	
	public Chair getChairByKey(int key) {
		
		return chairs.get(key);
	}
	
	public void removeChairByKey(int key) {
		
		chairs.remove(key);
	}
	
	public boolean isEmpty() {
		
		return chairs.isEmpty();
	}
}

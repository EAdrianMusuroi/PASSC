package BlackBoard;

import pipesAndFilters.Chair;

public class Control implements Runnable{
	
	private Blackboard blackboard;
	
	public Control(Blackboard bb) {
		
		this.blackboard = bb;
	}
	
	public void run() {
		
		Chair chair = null;
		int i;
		int contor = 1;
		
		while(true) {
			
			try {
				
				for(i = 0; i < 50; i++) {
					chair = blackboard.getChairByKey(i);
					if(chair != null) {
						if(chair.isSeat() && chair.isFeet() && chair.isBackrest() && chair.isPackage() && chair.isStabilizerBar()) {
							
							System.out.print("Chair number: " + contor++ + " ");
							System.out.println(chair);
							blackboard.removeChairByKey(i);
						}
					}
				}
				
				blackboard.fillBlackboard();
				Thread.sleep(300);
			}
			
			catch(InterruptedException e) {
	
				while(blackboard.isEmpty() == false) {
					for(i = 0; i < 50; i++) {
						chair = blackboard.getChairByKey(i);
						if(chair != null) {
							if(chair.isSeat() && chair.isFeet() && chair.isBackrest() && chair.isPackage() && chair.isStabilizerBar()) {
								
								System.out.print("Chair number: " + contor++ + " ");
								System.out.println(chair);
								blackboard.removeChairByKey(i);
							}
						}
					}
				}
				System.out.println("Control has been interrupted.");
				break;
			}
		}
	}
}

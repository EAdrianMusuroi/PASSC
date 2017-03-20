package BlackBoard;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import pipesAndFilters.Chair;

public class Control {
	
	BlockingQueue<Chair> queue = new ArrayBlockingQueue<Chair>(100);
	
	
}

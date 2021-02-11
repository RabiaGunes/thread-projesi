import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Kuyruk {
	
	//https://ufukuzun.wordpress.com/2015/05/02/javada-multithreading-bolum-7-producer-consumer-yapisi/
	
	private BlockingQueue queue0 = new ArrayBlockingQueue<>(500);
	private BlockingQueue queue1 = new ArrayBlockingQueue<>(500);
	private BlockingQueue queue2 = new ArrayBlockingQueue<>(500);
    private BlockingQueue queue3 = new ArrayBlockingQueue<>(500);
    private BlockingQueue queue4 = new ArrayBlockingQueue<>(500);
	    
    public BlockingQueue getQueue0() {
		return queue0;
	}
	public void setQueue0(BlockingQueue queue0) {
		this.queue0 = queue0;
	}
	public BlockingQueue getQueue1() {
		return queue1;
	}
	public void setQueue1(BlockingQueue queue1) {
		this.queue1 = queue1;
	}
	public BlockingQueue getQueue2() {
		return queue2;
	}
	public void setQueue2(BlockingQueue queue2) {
		this.queue2 = queue2;
	}
	public BlockingQueue getQueue3() {
		return queue3;
	}
	public void setQueue3(BlockingQueue queue3) {
		this.queue3 = queue3;
	}
	public BlockingQueue getQueue4() {
		return queue4;
	}
	public void setQueue4(BlockingQueue queue4) {
		this.queue4 = queue4;
	}

	 
	    
	    
	    

}

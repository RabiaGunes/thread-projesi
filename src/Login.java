import java.util.Queue;
import java.util.Random;


public class Login extends Thread  {
	
	public static int[] inside_katlar = {0,0,0,0,0};
    public static int exit_yapanlar = 0;
    public static int kisiRand;
    public static int floorRand;
    public static Random rand = new Random();
	public static Kuyruk que = new Kuyruk();
	public static Exit exit = new Exit();
	
	static Elevator1 elevator1 = new Elevator1(que);
	static Elevator2 elevator2 = new Elevator2(que);
	static Elevator3 elevator3 = new Elevator3(que);
	static Elevator4 elevator4 = new Elevator4(exit);
	static Elevator5 elevator5 = new Elevator5(exit);
	static Control control = new Control(elevator1, elevator2, elevator3, elevator4, elevator5);

    public Login(Elevator1 elevator1, Elevator2 elevator2 , Elevator3 elevator3, Elevator4 elevator4, Elevator5 elevator5) {
		this.elevator2=elevator2;
		this.elevator1 = elevator1;
		this.elevator3=elevator3;
		this.elevator4 = elevator4;
		this.elevator5=elevator5;
		
	}

	@Override
	public synchronized void run() {
     while (true) {
        	kisiRand = 1+rand.nextInt(9);
    		
            try {
            	for(int j=0;j<kisiRand;j++)
            	{
            		floorRand = 1+rand.nextInt(4);
            		que.getQueue0().put(floorRand);
            	}
            		
            	
            	System.out.println("kuyruk0:" +que.getQueue0());
            	System.out.println("size:" +que.getQueue0().size());
            	control.setBoyut(que.getQueue0().size());
            	Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            
            
        	control.setBoyut1(exit.que.getQueue1().size());
        	control.setBoyut1(exit.que.getQueue2().size());
        	control.setBoyut1(exit.que.getQueue3().size());
        	control.setBoyut1(exit.que.getQueue4().size());
        	
        }
	}


    public static void main(String[] args){
    	
		Thread tr = new Thread(elevator1);
		Thread tr2= new Thread(elevator2);
		Thread tr3= new Thread(elevator3);
		Thread tr4= new Thread(elevator4);
		Thread tr5 = new Thread(elevator5);
	
		Login login = new Login(elevator1, elevator2, elevator3, elevator4, elevator5);
		login.start();
		tr.start();
		tr2.start();
		tr3.start();
		tr4.start();
		tr5.start();
    	control.start();
    	exit.start();
    	try {
			login.join();
			tr.join();
			tr2.join();
			tr3.join();
			tr4.join();
			tr5.join();
			control.join();
			exit.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		}
}

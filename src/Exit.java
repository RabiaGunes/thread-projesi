import java.util.Random;

public class Exit extends Thread {
	
	public static int[] inside_katlar = {0,0,0,0,0};
    public static int exit_yapanlar = 0;
    public static int kisiRand;
    public static int floorRand;
    public static Random rand = new Random();
    public static Kuyruk que = new Kuyruk();
 
    
    @Override
	public void run() {
    	while (true) {
            try {
                Thread.sleep(1000);
                
            	kisiRand = 1+rand.nextInt(5);
        		floorRand = 1+rand.nextInt(4);
                try {
                	if(floorRand==1) {
                		for(int j=0;j<kisiRand;j++)
                    		que.getQueue1().put(0);
                	}
                	if(floorRand==2) {
                		for(int j=0;j<kisiRand;j++)
                			que.getQueue2().put(0);
                	}
                	if(floorRand==3) {
                		for(int j=0;j<kisiRand;j++)
                			que.getQueue3().put(0);
                	}
                	if(floorRand==4) {
                		for(int j=0;j<kisiRand;j++)
                			que.getQueue4().put(0);
                	}
           	
                
                } catch (InterruptedException e) {
                }
            	System.out.println("kuyruk1:" +que.getQueue1());   
            	System.out.println("kuyruk1 size:" +que.getQueue1().size());   
            	System.out.println("kuyruk2:" +que.getQueue2());
            	System.out.println("kuyruk2 size:" +que.getQueue2().size());  
            	System.out.println("kuyruk3:" +que.getQueue3());
            	System.out.println("kuyruk3 size:" +que.getQueue3().size());  
            	System.out.println("kuyruk4:" +que.getQueue4());
            	System.out.println("kuyruk4 size:" +que.getQueue4().size());  
             
            } catch (InterruptedException e) {
            }
        }
	}
  
    
    
}

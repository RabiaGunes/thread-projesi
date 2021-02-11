import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Elevator5 implements Runnable{
	
	Object lock5 = new Object();
	
	public static int ust,alt;
	public static boolean active = true ;
	public static int floor = 0;
	public static boolean destination;
	public static String direction;
	public static int capacity = 10;
	public static int count_inside = 0;
	public static int asansorID;	
	public static  ArrayList<Integer> inside = new ArrayList<Integer>();
    public static int[] inside_katlar = {0,0,0,0,0};
    public static int kuyrukBoyut2 , kuyrukBoyut3 ,kuyrukBoyut4,kuyrukBoyut1;
    int cikisYapanlar=0;
	public static Kuyruk kuyruk = new Kuyruk();
	public static Exit exit = new Exit();
   
	public Elevator5() {
		
		
	}
	
	public Elevator5(Exit exit) {
		ust=0;
		alt=0;
		active = true;
		floor=0;
		count_inside=0;
		destination= true;
		direction = "up";
		capacity=10;
		asansorID=3;
		this.exit=exit;
	}

	@Override
	public void run() {
		
		while(true) {
		synchronized(lock5) {
			try {
				lock5.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		

			
		           try {
		                Thread.sleep(200);
		              
		                
		                 if(exit.que.getQueue1().size()>20) {
		                	 
		                		System.out.println("Asansor5 calisiyor......");
		                	 
		                		for(int k=0;k<exit.que.getQueue1().size();k++) {
				                	if(Elevator5.count_inside<10) {
				                		Integer value = (Integer)exit.que.getQueue1().peek();
				                		System.out.println("Asansor5'e binen yolcular...(take):"+exit.que.getQueue1().peek());
				                		
					                	Elevator5.inside.add(value);
					                	Elevator5.count_inside++;
					                	//Collections.sort(Elevator5.inside);
					                	exit.que.getQueue1().remove(exit.que.getQueue1().peek());
					                	k--;
					                	
				                	} 
		                	}
		                		  Thread.sleep(200);
		                		
		                		for(int i=0;i<Elevator5.getInside().size();i++) {
		            	        	
				            		 System.out.println("Asansor5 1.katin yolcularini cikisa indiriyor.....");
				            		 inside_katlar[1]--;
				            		 Elevator5.count_inside--;
				            		 cikisYapanlar++;    
				            		 
				            	
				            	 
				             }
		               
				             Elevator5.getInside().clear();
				             Elevator5.count_inside=0;
				             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
		                	
		                }
		                
		                	else if(exit.que.getQueue2().size()>20) {
		                		
		                		System.out.println("Asansor5 calisiyor......");
		                		
		                		for(int k=0;k<exit.que.getQueue2().size();k++) {
				                	if(Elevator5.count_inside<10) {
				                		Integer value = (Integer)exit.que.getQueue2().peek();
				                		System.out.println("Asansor5'e binen yolcular...(take):"+exit.que.getQueue2().peek());
				                		
					                	Elevator5.inside.add(value);
					                	Elevator5.count_inside++;
					                	//Collections.sort(Elevator5.inside);
					                	exit.que.getQueue2().remove(exit.que.getQueue2().peek());
					                	k--;
					                	
				                	} 
		                	}
		                		  Thread.sleep(400);
		                		 
		                		
		                		for(int i=0;i<Elevator5.getInside().size();i++) {
		            	        	
				            		 System.out.println("Asansor5 2.katin yolcularini cikisa indiriyor.....");
				            		 inside_katlar[1]--;
				            		 Elevator5.count_inside--;
				            		 cikisYapanlar++;    
 	 
				             }
				
				             Elevator5.getInside().clear();
				             Elevator5.count_inside=0;
				             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
		                	
		                }
		                
		                	else if(exit.que.getQueue3().size()>20) {
		                		
		                		System.out.println("Asansor5 calisiyor......");
		                		
		                		for(int k=0;k<exit.que.getQueue3().size();k++) {
				                	if(Elevator5.count_inside<10) {
				                		Integer value = (Integer) exit.que.getQueue3().peek();
				                		System.out.println("Asansor5'e binen yolcular...(take):"+exit.que.getQueue3().peek());
				                		
					                	Elevator5.inside.add(value);
					                	Elevator5.count_inside++;
					                	//Collections.sort(Elevator5.inside);
					                	exit.que.getQueue3().remove(exit.que.getQueue3().peek());
					                	k--;
					                	
				                	} 
		                	}
		                		
		                		try {
									Thread.sleep(600);
								} catch (InterruptedException e) {
							
									e.printStackTrace();
								} 
		                		
		                		for(int i=0;i<Elevator5.getInside().size();i++) {
		            	        	
				            		 System.out.println("Asansor5 3.katin yolcularini cikisa indiriyor.....");
				            		 inside_katlar[1]--;
				            		 Elevator5.count_inside--;
				            		 cikisYapanlar++;    
				            		 
				            	
				            	 
				             }
				
				             Elevator5.getInside().clear();
				             Elevator5.count_inside=0;
				             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
		                	
		                }
		                
		                 
		                 
		                 
		                	else if(exit.que.getQueue4().size()>20) {
		                		
		                		System.out.println("Asansor5 calisiyor......");
		                		
		                		for(int k=0;k<exit.que.getQueue4().size();k++) {
				                	if(Elevator5.count_inside<10) {
				                		Integer value = (Integer) exit.que.getQueue4().peek();
				                		System.out.println("Asansor5'e binen yolcular...(take):"+exit.que.getQueue4().peek());
				                		
					                	Elevator5.inside.add(value);
					                	Elevator5.count_inside++;
					                	Collections.sort(Elevator5.inside);
					                	exit.que.getQueue4().remove(exit.que.getQueue4().peek());
					                	k--;
					                	
				                	} 
		                		}
		                		
		                		try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
							
									e.printStackTrace();
								} 
				                	for(int i=0;i<Elevator5.getInside().size();i++) {
				        	        	
					            		 System.out.println("Asansor5 4.katin yolcularini cikisa indiriyor.....");
					            		 inside_katlar[1]--;
					            		 Elevator5.count_inside--;
					            		 cikisYapanlar++;    
					            		 
					            	
					            	 
					             }
					
				                	
				        			
						             Elevator5.getInside().clear();
						             Elevator5.count_inside=0;
						             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);	
		                	
		                
		                }
		           
		                 
		                	else if(kuyruk.getQueue0().size()>20) {
				                for(int j=0;j<kuyruk.getQueue0().size();j++) {
				                	if(Elevator5.count_inside<10) {
				                		Integer value = (Integer) kuyruk.getQueue0().peek();
				                		System.out.println("Asansor5'e binen yolcular...(take):"+kuyruk.getQueue0().peek());
				                		
					                	Elevator5.inside.add(value);
					                	Elevator5.count_inside++;
					                	Collections.sort(Elevator5.inside);
					                	kuyruk.getQueue0().remove(kuyruk.getQueue0().peek());
					                	j--;
					                	
				                	}
				                	}
				                System.out.println("Asansor 5e binen kisiler(inside):"+Elevator5.getInside()+
			        		              "\nSuan calisan asansor5'deki kisi sayisi(count):"+Elevator5.count_inside);
			           
				                for(int i=0;i<Elevator5.getInside().size();i++) {

				               	 if(1==Elevator5.getInside().get(i)) {
				            		 System.out.println("Asansor5 birinci katta yolcu indiriyor.....");
				            		 inside_katlar[1]++;
				            		 Elevator5.count_inside--;
				            	 }
				            		 
				              	  if(2==Elevator5.getInside().get(i)) {
				              		System.out.println("Asansor5 ikinci katta indiriyor.....");
				            		 inside_katlar[2]++;
				            		 Elevator5.count_inside--;
				            	 }
				            		
				            	  if(3==Elevator5.getInside().get(i)) {
				            		  System.out.println("Asansor5 ucuncu katta indiriyor.....");
				            		 inside_katlar[3]++;
				            		 Elevator5.count_inside--;
				            	 }
				            		 
				            	  if(4==Elevator5.getInside().get(i)) {
				            		  System.out.println("Asansor5 dortuncu katta indiriyor.....");
				            		 inside_katlar[4]++;
				            		 Elevator5.count_inside--;
				            	 }
				            
				            	
				            		try {
										Thread.sleep(200);
									} catch (InterruptedException e) {
								
										e.printStackTrace();
									} 
				            		
				       		     
						             Elevator5.getInside().clear();
						             Elevator5.count_inside=0;
				            	 
				             }
				        	
				           System.out.println("1.katta bulunanlar:"+inside_katlar[1]+
				            		 "\n2.katta bulunanlar:"+inside_katlar[2]+
				            		 "\n3.katta bulunanlar:"+inside_katlar[3]+
				            		 "\n4.katta bulunanlar:"+inside_katlar[4]+
				            		 " asansor5 count:"+Elevator5.count_inside);
				           
				                } 
		                 
		                 
		                 
		          
		           
		
		}
		           
	                
		             catch (InterruptedException e) {
		            }

	}
		}
	}
	
	public void notifyEt() {
		synchronized(lock5) {
			lock5.notify();
		}
	}

	public static boolean isActive() {
		return active;
	}

	public static void setActive(boolean active) {
		Elevator1.active = active;
	}

	public static int getFloor() {
		return floor;
	}

	public static void setFloor(int floor) {
		Elevator1.floor = floor;
	}

	public static boolean isDestination() {
		return destination;
	}

	public static void setDestination(boolean destination) {
		Elevator1.destination = destination;
	}

	public static String getDirection() {
		return direction;
	}

	public static void setDirection(String direction) {
		Elevator1.direction = direction;
	}

	public static int getCapacity() {
		return capacity;
	}

	public static void setCapacity(int capacity) {
		Elevator1.capacity = capacity;
	}

	public static int getCount_inside() {
		return count_inside;
	}

	public static void setCount_inside(int count_inside) {
		Elevator1.count_inside = count_inside;
	}

	public static int getAsansorID() {
		return asansorID;
	}

	public static void setAsansorID(int asansorID) {
		Elevator1.asansorID = asansorID;
	}

	public static ArrayList<Integer> getInside() {
		return inside;
	}

	public static void setInside(ArrayList<Integer> inside) {
		Elevator1.inside = inside;
	}

	public static int[] getInside_katlar() {
		return inside_katlar;
	}

	public static void setInside_katlar(int[] inside_katlar) {
		Elevator1.inside_katlar = inside_katlar;
	}
	
	

}

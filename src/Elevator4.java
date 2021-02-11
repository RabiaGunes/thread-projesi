import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Elevator4 implements Runnable{
	
	Object lock4 = new Object();
	
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

    int cikisYapanlar=0;
	public static Kuyruk kuyruk = new Kuyruk();
	public static Exit exit = new Exit();
   
	public Elevator4() {
	
		
	}
	
	public Elevator4(Exit exit) {
		ust=0;
		alt=0;
		active = true;
		floor=0;
		count_inside=0;
		destination= true;
		direction = "up";
		capacity=10;
		asansorID=4;
		this.exit=exit;
	}

	@Override
	public void run() {
		
		while(true) {
		synchronized(lock4) {
			try {
				lock4.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		           try {
		        	   
		                Thread.sleep(200);
		                

		                if(kuyruk.getQueue1().size()>20) {
		        	   
		                	System.out.println("Asansor4 calisiyor......");
		                	
               		for(int k=0;k<exit.que.getQueue1().size();k++) {
		                	if(Elevator4.count_inside<10) {
		                		Integer value = (Integer) exit.que.getQueue1().peek();
		                		System.out.println("Asansor4'e binen yolcular...(take):"+exit.que.getQueue1().peek());
		                		
			                	Elevator4.inside.add(value);
			                	Elevator4.count_inside++;
			                	Collections.sort(Elevator4.inside);
			                	exit.que.getQueue1().remove(exit.que.getQueue1().peek());
			                	k--;
			                	
		                	} 
               	}
               		
               	  Thread.sleep(200);
	                
               		
               		for(int i=0;i<Elevator4.getInside().size();i++) {
           	        	
		            		 System.out.println("Asansor4 1.kattan cikisa yolcu indiriyor.....");
		            		 inside_katlar[1]--;
		            		 Elevator4.count_inside--;
		            		 cikisYapanlar++;    
		            		 
		            		try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
						
								e.printStackTrace();
							} 
		            	 
		             }
		
		             Elevator4.getInside().clear();
		             Elevator4.count_inside=0;
		             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
               	
               }
               
               	else if(exit.que.getQueue2().size()>20) {
               		
               		System.out.println("Asansor4 calisiyor......");
               		
               		for(int k=0;k<exit.que.getQueue2().size();k++) {
		                	if(Elevator4.count_inside<10) {
		                		Integer value = (Integer) exit.que.getQueue2().peek();
		                		System.out.println("Asansor4'e binen yolcular...(take):"+exit.que.getQueue2().peek());
		                		
			                	Elevator4.inside.add(value);
			                	Elevator4.count_inside++;
			                	//Collections.sort(Elevator5.inside);
			                	exit.que.getQueue2().remove(exit.que.getQueue2().peek());
			                	k--;
			                	
		                	} 
               	}
               		
               	  Thread.sleep(400);
	                
               		for(int i=0;i<Elevator4.getInside().size();i++) {
           	        	
		            		 System.out.println("Asansor4 2.kattan cikisa yolcu indiriyor.....");
		            		 inside_katlar[1]--;
		            		 Elevator4.count_inside--;
		            		 cikisYapanlar++;    
		            		 
		            		try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
						
								e.printStackTrace();
							} 
		            	 
		             }
		
		             Elevator4.getInside().clear();
		             Elevator4.count_inside=0;
		             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
               	
               }
               
               	else if(exit.que.getQueue3().size()>20) {
               		
               		System.out.println("Asansor4 calisiyor......");
               		
               		for(int k=0;k<exit.que.getQueue3().size();k++) {
		                	if(Elevator4.count_inside<10) {
		                		Integer value = (Integer) exit.que.getQueue3().peek();
		                		System.out.println("Asansor4'e binen yolcular...(take):"+exit.que.getQueue3().peek());
		                		
			                	Elevator4.inside.add(value);
			                	Elevator4.count_inside++;
			                	//Collections.sort(Elevator5.inside);
			                	exit.que.getQueue3().remove(exit.que.getQueue3().peek());
			                	k--;
			                	
		                	} 
               	}
               		
               	  Thread.sleep(600);
	                
               		
               		for(int i=0;i<Elevator4.getInside().size();i++) {
           	        	
		            		 System.out.println("Asansor4 3.kattan cikisa yolcu indiriyor.....");
		            		 inside_katlar[1]--;
		            		 Elevator4.count_inside--;
		            		 cikisYapanlar++;    
		            		 
		            		try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
						
								e.printStackTrace();
							} 
		            	 
		             }
		
		             Elevator4.getInside().clear();
		             Elevator4.count_inside=0;
		             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
               	
               }
               
               	else if(exit.que.getQueue4().size()>20) {
               		
               		System.out.println("Asansor4 calisiyor......");
               		
               		for(int k=0;k<exit.que.getQueue4().size();k++) {
		                	if(Elevator4.count_inside<10) {
		                		Integer value = (Integer) exit.que.getQueue4().peek();
		                		System.out.println("Asansor4'e binen yolcular...(take):"+exit.que.getQueue4().peek());
		                		
			                	Elevator4.inside.add(value);
			                	Elevator4.count_inside++;
			                	Collections.sort(Elevator4.inside);
			                	exit.que.getQueue4().remove(exit.que.getQueue4().peek());
			                	k--;
			                	
		                	} 
               		}
               		
               	  Thread.sleep(800);
	                
               		
		                	for(int i=0;i<Elevator4.getInside().size();i++) {
		        	        	
			            		 System.out.println("Asansor4 4.kattan cikisa yolcu indiriyor.....");
			            		 inside_katlar[1]--;
			            		 Elevator4.count_inside--;
			            		 cikisYapanlar++;    
			            		 
			          
			            	 
			             }
			
			             Elevator4.getInside().clear();
			             Elevator4.count_inside=0;
			             System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
               	}
               	
           
		                
		                
		                
		                 if(exit.que.getQueue0().size()>20) {
		                	 
		                		System.out.println("Asansor4 calisiyor......");
		                	 
		                for(int j=0;j<exit.que.getQueue0().size();j++) {
		                	if(Elevator4.count_inside<10) {
		                		Integer value = (Integer) exit.que.getQueue0().peek();
		                		System.out.println("Asansor4'e binen yolcular...(take):"+exit.que.getQueue0().peek());
		                		
			                	Elevator4.inside.add(value);
			                	Elevator4.count_inside++;
			                	//Collections.sort(Elevator4.inside);
			                	exit.que.getQueue0().remove(exit.que.getQueue0().peek());
			                	j--;
			                	
		                	} 
		                }
		                System.out.println("Asansor 4'e binen kisiler(inside):"+Elevator4.getInside()+
	        		              "\nSuan calisan asansor4'deki kisi sayisi(count):"+Elevator4.count_inside);
		                
			        	for(int i=0;i<Elevator4.getInside().size();i++) {
			        		
			        	
			            		 System.out.println("Asansor4 yolcu indiriyor.....");
			            		 inside_katlar[1]--;
			            		 Elevator4.count_inside--;
			            		 cikisYapanlar++;
			            	 
			            	 if(1==Elevator4.getInside().get(i)) {
			            		 System.out.println("Asansor4 birinci katta yolcu indiriyor.....");
			            		 inside_katlar[1]++;
			            		 Elevator4.count_inside--;
			            	 }
			            		 
			              	  if(2==Elevator4.getInside().get(i)) {
			              		System.out.println("Asansor4 ikinci katta indiriyor.....");
			            		 inside_katlar[2]++;
			            		 Elevator4.count_inside--;
			            	 }
			            		
			            	  if(3==Elevator4.getInside().get(i)) {
			            		  System.out.println("Asansor4 ucuncu katta indiriyor.....");
			            		 inside_katlar[3]++;
			            		 Elevator4.count_inside--;
			            	 }
			            		 
			            	  if(4==Elevator4.getInside().get(i)) {
			            		  System.out.println("Asansor4 dortuncu katta indiriyor.....");
			            		 inside_katlar[4]++;
			            		 Elevator4.count_inside--;
			            	 }
			            	
			            		try {
									Thread.sleep(200);
								} catch (InterruptedException e) {
							
									e.printStackTrace();
								} 
			            		
			       		     
					             Elevator4.getInside().clear();
					             Elevator4.count_inside=0;
			            	 
			             }
			        	
			           System.out.println("1.katta bulunanlar:"+inside_katlar[1]+
			            		 "\n2.katta bulunanlar:"+inside_katlar[2]+
			            		 "\n3.katta bulunanlar:"+inside_katlar[3]+
			            		 "\n4.katta bulunanlar:"+inside_katlar[4]+
			            		 " asansor4 count:"+Elevator4.count_inside);
		                }
		           
		                 
		                
		                	                
               
           } catch (InterruptedException e) {
           }
         
          	for(int i=0;i<Elevator4.count_inside;i++) {
          		if(floor<Elevator4.getInside().get(i)) {
          			ust++;
          		}
          		else {
          			alt++;
          		}
          	}

          	
          	if(ust>alt) {
          		floor++;
          	}else {
          		floor--;
          	}
          	

       }	
	
}

}

	
	public void notifyEt() {
		synchronized(lock4) {
			lock4.notify();
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

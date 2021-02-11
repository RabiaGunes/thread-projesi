import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Elevator3 implements Runnable{
	
	Object lock3 = new Object();
	
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
	
   
	public Elevator3() {
	
		
	}
	
	public Elevator3(Kuyruk kuyruk) {
		ust=0;
		alt=0;
		active = true;
		floor=0;
		count_inside=0;
		destination= true;
		direction = "up";
		capacity=10;
		asansorID=3;
		this.kuyruk=kuyruk;
	}

	@Override
	public void run() {
		
		while(true) {
		synchronized(lock3) {
			try {
				lock3.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println("Asansor3 calisiyor......");
		
		
		           try {
		                Thread.sleep(200);
		                
		                for(int j=0;j<kuyruk.getQueue0().size();j++) {
		                	if(Elevator3.count_inside<10) {
		                		Integer value = (Integer) kuyruk.getQueue0().peek();
		                		System.out.println("Asansor3'e binen yolcular...(take):"+kuyruk.getQueue0().peek());
		                		
			                	Elevator3.inside.add(value);
			                	Elevator3.count_inside++;
			                	//Collections.sort(Elevator3.inside);
			                	kuyruk.getQueue0().remove(kuyruk.getQueue0().peek());
			                	j--;
			                	
		                	} 
		                }
		                
		            } catch (InterruptedException e) {
		            }
		           System.out.println("Asansor3'e binen kisiler(inside):"+Elevator3.getInside()+
		        		              "\nSuan calisan asansor3'deki kisi sayisi(count):"+Elevator3.count_inside);
		           
		           	for(int i=0;i<Elevator3.count_inside;i++) {
		           		if(floor<Elevator3.getInside().get(i)) {
		           			ust++;
		           		}
		           		else {
		           			alt++;
		           		}
		           	}
		           	//System.out.println("floor:"+floor+"alt:"+alt+"ust:"+ust);
		           	
		           	if(ust>alt) {
		           		floor++;
		           	}else {
		           		floor--;
		           	}
		           	
		           
		        	for(int i=0;i<Elevator3.getInside().size();i++) {
		        		
		        	
		            		if(1==Elevator3.getInside().get(i)) {
		            		 System.out.println("Asansor3 birinci katta yolcu indiriyor.....");
		            		 inside_katlar[1]++;
		            		 Elevator3.count_inside--;
		            	 }
		            		 
		              	  if(2==Elevator3.getInside().get(i)) {
		              		System.out.println("Asansor3 ikinci katta indiriyor.....");
		            		 inside_katlar[2]++;
		            		 Elevator3.count_inside--;
		            	 }
		            		
		            	  if(3==Elevator3.getInside().get(i)) {
		            		  System.out.println("Asansor3 ucuncu katta indiriyor.....");
		            		 inside_katlar[3]++;
		            		 Elevator3.count_inside--;
		            	 }
		            		 
		            	  if(4==Elevator3.getInside().get(i)) {
		            		  System.out.println("Asansor3 dortuncu katta indiriyor.....");
		            		 inside_katlar[4]++;
		            		 Elevator3.count_inside--;
		            	 }
		            	
		            		try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
						
								e.printStackTrace();
							} 
		            	 
		             }
		        	
		          System.out.println("1.katta bulunanlar:"+inside_katlar[1]+
		            		 "\n2.katta bulunanlar:"+inside_katlar[2]+
		            		 "\n3.katta bulunanlar:"+inside_katlar[3]+
		            		 "\n4.katta bulunanlar:"+inside_katlar[4]+
		            		 " asansor3 count:"+Elevator2.count_inside);
		             
		     
		             Elevator3.getInside().clear();
		             Elevator3.count_inside=0;
		           //  System.out.println("cikisYapanlar sayisi:"+cikisYapanlar);
		             //System.out.println("3inside:"+Elevator2.getInside()+" count:"+Elevator2.count_inside);
		         
		        }	
			
		}

	}
	
	public void notifyEt() {
		synchronized(lock3) {
			lock3.notify();
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

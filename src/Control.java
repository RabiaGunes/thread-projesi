public class Control extends Thread{

	Elevator1 elevator1 = new Elevator1();
	Elevator2 elevator2= new Elevator2();
	Elevator3 elevator3 = new Elevator3();
	Elevator4 elevator4= new Elevator4();
	Elevator5 elevator5 = new Elevator5();
	Exit exit = new Exit();
	private int boyut, boyut1, boyut2, boyut3, boyut4;
	

	public Control(Elevator1 elevator1, Elevator2 elevator2, Elevator3 elevator3, Elevator4 elevator4, Elevator5 elevator5 ) {
		this.elevator2=elevator2;
		this.elevator1 = elevator1;
		this.elevator3=elevator3;
		this.elevator4 = elevator4;
		this.elevator5=elevator5;
		
	}



	@Override
	public synchronized void run() {


		while(true) {
			
			System.out.println("Avm'de asansor bekleyen toplam kisi:"+(boyut+boyut1+boyut2+boyut3+boyut4));

			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			if(boyut<20 ) {
		
				elevator1.notifyEt();
				elevator5.notifyEt();
				
			}else if(boyut>=20 && boyut<40) {
			
				elevator1.notifyEt();
				elevator2.notifyEt();
				elevator5.notifyEt();
			
				
			}else if(boyut>=40 && boyut<50) {

				elevator1.notifyEt();
				elevator2.notifyEt();
				elevator3.notifyEt();
				elevator5.notifyEt();
				
			}else if(boyut>=50 && boyut<60) {
				
				elevator1.notifyEt();
				elevator2.notifyEt();
				elevator3.notifyEt();
				elevator4.notifyEt();
				elevator5.notifyEt();
			}
			else {
				elevator1.notifyEt();
				elevator2.notifyEt();
				elevator3.notifyEt();
				elevator4.notifyEt();
				elevator5.notifyEt();
			}
		}				
	}


	public int getBoyut() {
		return boyut;
	}


	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}


	public int getBoyut1() {
		return boyut1;
	}


	public void setBoyut1(int boyut1) {
		this.boyut1 = boyut1;
	}


	public int getBoyut2() {
		return boyut2;
	}


	public void setBoyut2(int boyut2) {
		this.boyut2 = boyut2;
	}


	public int getBoyut3() {
		return boyut3;
	}


	public void setBoyut3(int boyut3) {
		this.boyut3 = boyut3;
	}


	public int getBoyut4() {
		return boyut4;
	}


	public void setBoyut4(int boyut4) {
		this.boyut4 = boyut4;
	}
	
	

}

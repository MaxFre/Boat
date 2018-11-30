import javax.swing.JLabel;

public class boatThread implements Runnable{

	
	JLabel boat;
	int mover = 70;
	boolean up = false;
	
	public boatThread(JLabel boat){
		this.boat = boat;
		boat.setBounds(70, mover, 219, 350);
		
	}
	
	
	@Override
	public void run() {
		while(true){
			
			try {
			
				Thread.sleep(20);
				
				boat.setBounds(70, mover, 219, 350);
				
				if(up == true){
					mover = mover - 4;
				  }
				
				if( up == false){
					mover = mover + 4;
				  }
				
				if(mover>=130){
					up = true;
				}
				
				if(mover<=-160){
					up = false;
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}

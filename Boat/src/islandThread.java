
import javax.swing.JLabel;

public class islandThread  implements Runnable{

	JLabel island, island2, island3;
	int mover = 420;
	int mover2 = 420;
	int mover3 = 420;
	
	public islandThread(JLabel island,JLabel island2, JLabel island3){
		this.island = island;
		this.island2 = island2;
		this.island3 = island3;
		
//		
//		island.setBounds(mover+1250, -120, 219, 380);
//		island2.setBounds(mover+550, 25, 219, 380);
//		island3.setBounds(mover, 115, 219, 380);
		
	}
	
	
	
	
	public void run() {
		while(true){
			
			try {
				
				Thread.sleep(10);
				island.setBounds(mover + 950, -120, 219, 380);
				island2.setBounds(mover2 + 550, 25, 219, 380);
				island3.setBounds(mover3, 115, 219, 380);
				
				mover = mover - 4;
				mover2 = mover2 - 4;
				mover3 = mover3 - 4;
				
				if(mover<=-1300){
					mover = 420;
					
				  }
				if(mover2<=-750){
					mover2 = 420;
					
				  }
				if(mover3<=-250){
					mover3 = 820;
					
				  }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}

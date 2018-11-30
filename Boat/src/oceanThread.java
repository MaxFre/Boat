import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class oceanThread  implements Runnable{

	
	JLabel ocean;
	int mover = 0;
	
	public oceanThread(JLabel ocean){
		this.ocean = ocean;
		ocean.setBounds(0, mover, 819, 1838);
		 
	}

	@Override
	public void run() {
		try {
			while(true){
				
			mover = mover - 4;
			Thread.sleep(20);
			ocean.setBounds(mover, 0, 1819, 388);
						
			if(mover<=-800){
				mover = 0;
//				System.out.println("now");
			  }
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

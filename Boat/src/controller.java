import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class controller {

	
	gui gui;
	oceanThread oceanThread;
	boatThread boatThread;
	islandThread islandThread;
	Thread oceanMoving, boatMoving, islandMoving;
	
	public controller(){
		gui = new gui(this);
	}
	
	
	
	public void toOceanThread(JLabel ocean){
		oceanThread = new oceanThread(ocean);
		oceanMoving = new Thread(oceanThread);
		oceanMoving.start();	
	}
	
	public void toBoatThread(JLabel boat){
		boatThread = new boatThread(boat);
		boatMoving = new Thread(boatThread);
		boatMoving.start();	
	}
	
	public void toIslandThread(JLabel island,JLabel island2 ,JLabel island3){
		islandThread = new islandThread(island, island2, island3);
		islandMoving = new Thread(islandThread);
		islandMoving.start();	
	}
	
	public static void main(String[] args) {

		controller run = new controller();

	}
}

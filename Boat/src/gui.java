import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class gui extends JFrame implements ActionListener {
	
	private JFrame frame;
	controller controller;
	JLabel ocean, boat, island, island2, island3;
	
	public gui(controller controller){
		this.controller = controller;
		start();
	}
	
	public void start(){
		
		frame = new JFrame();
		ocean = new JLabel(new ImageIcon("images/Ocean.png"));
		boat = new JLabel(new ImageIcon("images/Boat.png"));
		island = new JLabel(new ImageIcon("images/Island.png"));
		island2 = new JLabel(new ImageIcon("images/Island.png"));
		island3 = new JLabel(new ImageIcon("images/Island.png"));
		
		frame.add(island2);
		frame.add(island3);
		frame.add(boat);
		frame.add(island);
	
		frame.add(ocean);
		
		frame.setBounds(0, 0, 819, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setTitle("SummerGame");				
		frame.setVisible(true);
		frame.setResizable(false);			// Prevent user from change size
		frame.setLocationRelativeTo(null);	// Start middle screen
		
		InitializeGUI();					// Fill in components
		
	}
	
	private void InitializeGUI(){
		controller.toOceanThread(ocean);
		controller.toBoatThread(boat);
		controller.toIslandThread(island,island2,island3);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

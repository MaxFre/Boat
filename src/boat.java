package projekt;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;







public class boat extends JPanel {
	
	private ColorDisplay colordisplay;
	int boatMove = 0;
	int waves = 0;
	int move = 0;
	private int[][] tempBakground = new int[80][100];
	private int[][] bakground = new int[80][80];
	private int[][] island = {
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.BLUE,Color.BLUE,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.BROWN,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.BLUE,Color.BROWN,Color.BROWN,Color.GREEN,Color.BLUE,Color.BLUE,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.BLUE,Color.BROWN,Color.BROWN,Color.BLUE,Color.GREEN,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BROWN,Color.BROWN,Color.BLUE,Color.BLUE,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BROWN,Color.BROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.BROWN,Color.BROWN,Color.GREEN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.BLUE,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.YELLOW,Color.YELLOW,Color.GREEN,Color.GREEN,Color.GREEN,Color.GREEN,Color.YELLOW,Color.YELLOW,Color.BLUE,Color.BLUE,},
			{Color.BLUE,Color.BLUE,Color.GREEN,Color.YELLOW,Color.GREEN,Color.YELLOW,Color.GREEN,Color.GREEN,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.BLUE,},
			{Color.BLUE,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,},
			{Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.YELLOW,},			
	};
	
	
	private int[][] boat = {
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.YELLOW,Color.YELLOW,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.YELLOW,Color.YELLOW,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.YELLOW,Color.YELLOW,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.YELLOW,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.YELLOW,Color.YELLOW,Color.YELLOW,Color.LTBROWN,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.YELLOW,Color.LTGRAY,Color.YELLOW,Color.LTBROWN,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.LTGRAY,Color.LTGRAY,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,Color.BROWN,},
			  {Color.BLUE,Color.BLUE,Color.LTBROWN,Color.LTBROWN,Color.BLACK,Color.LTBROWN,Color.LTBROWN,Color.BLACK,Color.LTBROWN,Color.BLACK,Color.LTBROWN,Color.BLACK,Color.LTBROWN,Color.BLACK,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.BLUE,Color.BLUE,},						  
			  {Color.BLUE,Color.BLUE,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.BLUE,Color.BLUE,},
			  {Color.BLUE,Color.BLUE,Color.BLUE,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.LTBROWN,Color.BLUE,Color.BLUE,Color.BLUE,Color.BLUE,},
				  
			  };

	public void updateDisplay(int[][] colors, int high, int move) {
		colordisplay.setDisplay(colors, high, move);
		colordisplay.updateDisplay();
	}


	protected void showLetter(int[][] boxes,int high, int move) {
		updateDisplay(boxes,high,move);
	}
	
	public boat(int verticalPages, int horizontalpages, int background, int grid) {
//		ButtonListener btnListener = new ButtonListener();
		colordisplay = new ColorDisplay(1,1, Color.BLACK, Color.GRAY);
		setLayout(new BorderLayout());
		add(colordisplay, BorderLayout.CENTER);
		start();
		move();
		
	}
	
	
	
   public void start(){
	   
	   

	   for(int i = 0; i < tempBakground.length; i++){
			for(int y = 0; y < tempBakground[i].length; y++){
				tempBakground[i][y] = Color.BLUE;
			 }
			}
	   
   
	   for(int i = 0; i < bakground.length; i++){
			for(int y = 0; y < bakground[i].length; y++){
				bakground[i][y] = Color.BLUE;
			}
		
			showLetter(bakground,0,0);	
   }
	
	   
	   

	   for(int i = 0; i < boat.length; i++){
			for(int y = 0; y < boat[i].length; y++){
				bakground[i+40][y+40] = boat[i][y];
			}}
	   
	   
	   
	   for(int i = 0; i < island.length; i++){
			for(int y = 0; y < island[i].length; y++){
				bakground[i+60][y+9] = island[i][y];
			}}
	   
	   for(int i = 0; i < island.length; i++){
			for(int y = 0; y < island[i].length; y++){
				bakground[i][y+19] = island[i][y];
			}}
	   
	   for(int i = 0; i < island.length; i++){
			for(int y = 0; y < island[i].length; y++){
				bakground[i+20][y+49] = island[i][y];
	
   
			}
			}

	   
	   showLetter(bakground,0,0);	
	   }
	
	
	
	public void move() {

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			 
			public void run() {
           
				if (move < 1) {

					waves();
					islands();
					boat();
					showLetter(bakground, 0, 0);

				}

			}
		};
		
		timer.schedule(task, 0, 40);

	}	
	
	public void boat(){
		
		
		if(boatMove<30){

			for(int a = 0; a < boat.length; a++){
				for(int b = 0; b < boat[a].length; b++){
					bakground[a+39][b+40] = Color.BLUE;
				}
			}
			 for(int i = 0; i < boat.length; i++){
					for(int y = 0; y < boat[i].length; y++){
						bakground[i+40][y+40] = Color.BLUE;
					}
					}
			
			
			
		}
		
		if(boatMove>60){

			for(int a = 0; a < boat.length; a++){
				for(int b = 0; b < boat[a].length; b++){
					bakground[a+40][b+40] = Color.BLUE;
				}
			}
			for(int a = 0; a < boat.length; a++){
				for(int b = 0; b < boat[a].length; b++){
					bakground[a+39][b+40] = boat[a][b];
				}
			}
			
		}
		else
			
	
		  for(int a = 0; a < boat.length; a++){
				for(int b = 0; b < boat[a].length; b++){
					bakground[a+40][b+40] = boat[a][b];
				}
			}
		  boatMove++;
		  
		  if(boatMove==100){
			  boatMove=0;
		  }
		 
	}

	public void islands(){
	
		for(int i = 0; i < bakground.length; i++){
			for(int y = 0; y < bakground[i].length; y++){
				if(!(bakground[i][y]==Color.BLUE) && !(bakground[i][y]==Color.WHITE)){
					
					if(y>0)
					bakground[i][y-1] = bakground[i][y];
					bakground[i][y] = bakground[i][y+1];
					
					

					if(y<2){

						for(int a = 0; a < bakground.length; a++){
							for(int b = 0; b < bakground[i].length; b++){
								bakground[a][78] = bakground[a][0];
							}
						}
					}
				}
				
			}
			
			
		}
		
	}

	

	public void waves(){
		Random wave1 = new Random();
		Random wave2 = new Random();
		Random wave3 = new Random();
		Random wave4 = new Random();
		Random wave5 = new Random();
		int wavePlace1 = wave1.nextInt(80);		
		int wavePlace2 = wave2.nextInt(80);		
		int wavePlace3 = wave3.nextInt(80);		
		int wavePlace4 = wave4.nextInt(80);		
		int wavePlace5 = wave5.nextInt(80);	
		
		
		 for(int i = 0; i < bakground.length; i++){
				for(int y = 0; y < bakground[i].length; y++){
					
				  if(waves == 20 ){
					 if(bakground[wavePlace1][63]==Color.BLUE  && (bakground[wavePlace1][63-1]==Color.BLUE)){
						 
					  bakground[wavePlace1][63]=Color.WHITE;
					  bakground[wavePlace1][63+1]=Color.WHITE;
					 }
					 
					 if(bakground[wavePlace2][75]==Color.BLUE  && (bakground[wavePlace1][75-1]==Color.BLUE)){
					  bakground[wavePlace2][75]=Color.WHITE;
					  bakground[wavePlace2][75+1]=Color.WHITE;
					 }
					 if(bakground[wavePlace3][36]==Color.BLUE && (bakground[wavePlace1][36-1]==Color.BLUE)){
					  bakground[wavePlace3][36]=Color.WHITE;
					  bakground[wavePlace3][36+1]=Color.WHITE;
					 }
					 if(bakground[wavePlace4][59]==Color.BLUE && (bakground[wavePlace1][59-1]==Color.BLUE)){
					  bakground[wavePlace4][59]=Color.WHITE;
					  bakground[wavePlace4][59+1]=Color.WHITE;
					 }
					 if(bakground[wavePlace5][61]==Color.BLUE && (bakground[wavePlace1][61-1]==Color.BLUE)){
					  bakground[wavePlace5][61]=Color.WHITE;
					  bakground[wavePlace5][61+1]=Color.WHITE;
				  }							
				
		
		    }
		  }
		}
		 for(int i = 0; i < bakground.length; i++){
				for(int y = 0; y < bakground[i].length; y++){
					 if(waves > 33){
						 if(bakground[i][y]==Color.WHITE){
							 bakground[i][y]=Color.BLUE;  
							
				 }
				 }
					 
		 	}
		 }
        
		 if(waves >33){
			 waves = 0;
		 }
		   
		
		
		waves++;
		for(int a = 0; a < bakground.length; a++){
			for(int b = 0; b < bakground[a].length; b++){
		      if(bakground[a][b]==Color.WHITE){
		    	  if(bakground[a][b-1]==Color.BLUE)
		    	  bakground[a][b-1]=bakground[a][b];
		    	  bakground[a][b] = Color.BLUE;
		
		}}
		
	}
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				boat view = new boat(1, 1, Color.BLACK, Color.GRAY);
				JFrame frame = new JFrame();
				frame.setPreferredSize(new Dimension(700,720));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(view);
				frame.pack();
				frame.setVisible(true);

			}
		});
	}

}
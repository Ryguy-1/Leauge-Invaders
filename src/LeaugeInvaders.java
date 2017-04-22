

import javax.swing.JFrame;

public class LeaugeInvaders {

	GamePanel panel;
	
	JFrame frame;

	int width = 500;
	int height = 800;
	
	public static void main(String[] args) {
	
		LeaugeInvaders invade = new LeaugeInvaders();
		
	
		
}

 
	LeaugeInvaders(){
	
		frame = new JFrame();
		
		panel = new GamePanel();
		
		frame.add(panel);
		
		frame.addKeyListener(panel);
		
		setup();
		
		
	
}
	


	void setup(){
		
		frame.setVisible(true);
		frame.setSize(500, 800);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.StartGame();
		
	}

	
	
	
	
	
}

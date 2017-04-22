import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener, KeyListener{

	
	
	Timer timer;
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	
	int currentState = MENU_STATE;
	
	
	public void paintComponent(Graphics g){
		
		if(currentState == MENU_STATE){
			updateMenuState(g);
		}else if(currentState == GAME_STATE){
			updateGameState(g);
		}else if(currentState == END_STATE){
			updateEndState(g);
		}

		
	}

	
	
	GamePanel(){
		
		timer = new Timer(1000/60, this);
		
		
		
	}
	
	void ActionPerformed(){
		
		
		
	}
	
	void StartGame(){
		
		timer.start();
	}
	
	void updateMenuState(Graphics g){
		
		
	}
	
	void updateGameState(Graphics g){
		
		
	}
	
	void updateEndState(Graphics g){
		
		
	}

	void drawMenuState(){
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeaugeInvaders.width, LeaugeInvaders.height);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		repaint();
		
		if(currentState == MENU_STATE){
			updateMenuState(getGraphics());
		}else if(currentState == GAME_STATE){
			updateGameState(getGraphics());
		}else if(currentState == END_STATE){
			updateEndState(getGraphics());
		}

		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Typed");
		
	
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Event");
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Event2");
		
		
		
	}
	
}

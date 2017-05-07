import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener  {

	Font bigFont;
	Font smallFont;

	ArrayList<Integer> keys = new ArrayList<>();
	
	
	RocketShip ship = new RocketShip(250, 700, 50, 50);

	ObjectManager manager = new ObjectManager();
	
	Timer timer;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;

	int currentState = MENU_STATE;

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	GamePanel() {

		timer = new Timer(1000 / 60, this);

		bigFont = new Font("Arial", Font.PLAIN, 48);
		smallFont = new Font("Arial", Font.PLAIN, 22);

		manager.addObject(ship);
		
	}

	void ActionPerformed() {

	}

	void StartGame() {

		timer.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {

		for (int i = 0; i < keys.size(); i++) {
			
			int keyPressed = keys.get(i);
			
			

			if (keyPressed == KeyEvent.VK_UP) {

				ship.y -= ship.speed;

			}
			if (keyPressed == KeyEvent.VK_DOWN) {

				ship.y += ship.speed;

			}
			if (keyPressed == KeyEvent.VK_LEFT) {

				ship.x -= ship.speed;

			}
			if (keyPressed == KeyEvent.VK_RIGHT) {

				ship.x += ship.speed;

			}
			if (keyPressed == KeyEvent.VK_SPACE){
				
				manager.addObject(new Projectile(ship.x + 20,ship.y, 10,10));
				
			}
			
			manager.manageEnemies();
			manager.checkCollision();
			
			
			if (ship.isAlive == false){
				
				currentState = END_STATE;
				
			}
			
		}
		
		
		
		manager.update();
		

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeaugeInvaders.width, LeaugeInvaders.height);

		g.setColor(Color.ORANGE);
		g.setFont(bigFont);
		g.drawString("Leauge Invaders", 75, 200);

		// g.setColor(Color.ORANGE);
		g.setFont(smallFont);
		g.drawString("Press Enter To Begin", 150, 650);
	}

	void drawGameState(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeaugeInvaders.width, LeaugeInvaders.height);

		manager.draw(g);

		
		
	}

	void drawEndState(Graphics g) {

		g.setColor(Color.RED);
		g.fillRect(0, 0, LeaugeInvaders.width, LeaugeInvaders.height);

		g.setColor(Color.BLACK);
		g.setFont(bigFont);
		g.drawString("You're Bad", 125, 200);

		g.setFont(smallFont);
		g.drawString("Press __ To Try Again", 150, 650);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		repaint();

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!keys.contains(e.getKeyCode()))
		keys.add(e.getKeyCode());
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			currentState += 1;

		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		
		
		keys.remove((Integer) e.getKeyCode());
		
	}

}

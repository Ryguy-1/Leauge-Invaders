import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {

	
	int speed;
	
	
	
	

	public RocketShip(int x, int y, int width, int height) {
		super(x, y, width, height);

		this.speed = 8;
		// TODO Auto-generated constructor stub
	}
	
	

void draw(Graphics g){
		
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null); 
		
		
	}
	
	void update(){
		
		super.update();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

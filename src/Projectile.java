import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

	int speed;
	
	public Projectile(int x, int y, int width, int height){
		super(x, y, width, height);
	this.speed=8;
	
	}
	
	void draw(Graphics g){
		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);
		
	}
	
	void update(){
		
		super.update();
		y -= speed;
		
		if (y<0){
			
			isAlive = false;
			
		}
		
		
		
	}
	
	
}

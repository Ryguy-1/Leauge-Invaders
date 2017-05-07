import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

	int x;
	int y;
	int width;
	int height;
	int speed;
	
	public Projectile(int x, int y, int width, int height){
		super();
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
	this.speed=10;
	
	}
	
	void draw(Graphics g){
		
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
		
	}
	
	void update(){
		
		super.update();
		
		y -= speed;
		
		if (y<0){
			
			isAlive = false;
			
		}
		
		
		
	}
	
	
}

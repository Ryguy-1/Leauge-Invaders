import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {

	
	int speed;
	
	
	
	
	
	
	
	RocketShip(){
		
		
		
	}
	
	public RocketShip(int x, int y, int width, int height) {
		super();
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.speed = 8;
		// TODO Auto-generated constructor stub
	}
	
	

	void draw(Graphics g){
		
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		
		
	}
	
	void update(){
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

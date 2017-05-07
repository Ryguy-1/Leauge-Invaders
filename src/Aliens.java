import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject {

	int x;
	int y;
	int width;
	int height;
	int speed;
	
	
	
	
	
	public Aliens(int x, int y, int width, int height){
		super();
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.speed=10;
		
		
	}
	
void draw(Graphics g){
		
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
		
		
	}
	
	void update(){
		
		super.update();
		
		y += speed;
		
		
		
	}
	
}

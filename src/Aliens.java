import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject {


	int speed;
	
	public Aliens(int x, int y, int width, int height){
		super(x, y, width, height);
		this.speed=8;
		
	}
	
void draw(Graphics g){
		
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
		
		
	}
	
	void update(){
		
		super.update();
		
		y += speed;
		
		
		
	}
	
}

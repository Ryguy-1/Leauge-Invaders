import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {

	Rectangle collisionBox;
	
	boolean isAlive = true;
	
	int x = 200;
	int y = 700;
	int width;
	int height;
	
	
	public GameObject(){
		
		collisionBox = new Rectangle(x, y, width, height);
		
	}
	
	
	void update(){
		
	collisionBox.setBounds(x, y, width, height);
	
		
		
	}
	
	void draw(Graphics g){
		
		
		
	}
	
}

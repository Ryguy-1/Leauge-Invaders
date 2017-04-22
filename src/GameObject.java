import java.awt.Graphics;

public class GameObject {

	int x = 200;
	int y = 700;
	int width;
	int height;
	
	void update(){
		
	y -= 1;
	
		
		
	}
	
	void draw(Graphics g){
		
		g.fillRect(x, y, 100, 100);
		
	}
	
}

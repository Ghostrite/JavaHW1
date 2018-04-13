import java.awt.Color;
import java.awt.Graphics;

public class Powerup {
	
	HumanPaddle player;
	int x,y;
	
	public Powerup(HumanPaddle p) {
		player = p;
		x= randomX();
		y = randomY();
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 20, 20);
	}
	
	private int randomX() {
		
		int range = (500-200) + 1;
		return (int) (Math.random()*range) + 200;
		
	}
	
	private int randomY() {
		
		int range = (480-10)+1;
		return (int) (Math.random()*range)+10;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public String toString() {
		return "I am here";
	}
	
	
	
	
	
	

}

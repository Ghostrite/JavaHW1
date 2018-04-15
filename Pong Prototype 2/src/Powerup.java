import java.awt.Color;
import java.awt.Graphics;

public abstract class Powerup {
	
	protected int x,y;
	protected Color color;
	protected HumanPaddle p1,p2;
	
	public Powerup(HumanPaddle p1, HumanPaddle p2) {
//		player = p;
		x= randomX();
		y = randomY();
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	public abstract void draw(Graphics g);	
	public abstract void effect(HumanPaddle p);
	
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
	
	
	protected Color getColor() {
		return color;
	}

}
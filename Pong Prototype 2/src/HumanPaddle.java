import java.awt.*;
import java.util.ArrayList;
import java.lang.*;

public class HumanPaddle implements Paddle {
	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
	int player, x;
	public Color color = new Color(255,255,255);
	Color powerColor;
	private Powerup playerpowerup;
	public int lives;
	private int length = 80;
	private int bound = 420;
	
	
	public HumanPaddle(int player) throws NullPointerException{
		this.player = player;
		upAccel = false; downAccel = false;
		y = 210; yVel = 0;
		if (player == 1)
			x= 20;
		else
			x = 660;
		
		playerpowerup = null;
		lives = 3;
		powerColor = new Color(0,0,0);
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, (int)y, 20, length);
		if(player == 1) {
			g.setColor(powerColor);
			g.fillRect(277, 532, 30, 30);
			;
		}
		else {
			g.setColor(powerColor);
			g.fillRect(392, 532, 30, 30);
			
		}
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	
	public void move() {
		if(upAccel) {
			yVel -= 2;
			
		}
		else if(downAccel){
			yVel += 2;
			
		}
		else if (!upAccel && !downAccel) {
			yVel*= GRAVITY;
		}
		if(yVel>=5)
			yVel=5;
		else if(yVel <= -5) {
			yVel = -5;
			
		}
		y+= yVel;
		
		if (y<0){
			y=0;}
		if(y>bound) {
			y=bound;}
		
	}
	public void setBound(int len_p) {
		bound = 500 - len_p;
	}
	public int getBound() {
		return bound;
	}
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	public void setDownAccel(boolean input) {
		downAccel = input;
	}
	
	
	public int getY() {
		return(int)y;
	}
	public int getX() {
		return(int)x;
	}
	
	public void addPower(Powerup p) throws NullPointerException{
		playerpowerup = p;
	}
	
	public Powerup usePower() {
		
		Powerup p = playerpowerup;
		playerpowerup = null;
		return p;
	}
	
	public void powerupDisplay(Color c) {
		powerColor = c;
	}
	
	
	
	
	
	
	
	
	
	
	
}









class PlayerPowerups {
	
private ArrayList<Powerup> p;
	
	public PlayerPowerups() {
		p = new ArrayList<Powerup>();	
	}
	
	public void add(Powerup pup) {
		p.add(pup);
	}
	
	public Powerup remove(Powerup pup) {
		
		return p.remove(p.indexOf(pup));
	}
	
	
	
}
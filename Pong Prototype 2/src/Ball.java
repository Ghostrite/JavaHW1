import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	double xVel, yVel, x, y;
	int tempvelx,tempvely;
	private boolean gtg = true;
	public Ball() {
		x= 350;
		y=250;

		xVel= getRandomSpeed() * getRandomDirection();
		yVel= getRandomSpeed() * getRandomDirection();
		
	}
	
	public double getRandomSpeed() {
		return (Math.random()*1 + 2);
	}
	
	public int getRandomDirection() {
		int rand = (int)(Math.random() * 2);
		if (rand==2)
			return 1;
		else
			return -1;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval((int)x-10, (int)y-10, 20, 20);
	}
	
	public void checkPaddleCollision(HumanPaddle p1, HumanPaddle p2) {
		
		if(x <=50 && x>=20) {
			if(y >=p1.getY() && y <= p1.getY() + p1.getLength() && xVel < 0) { 
				if(x >=p1.getX() && x <= p1.getX() + 20) {
					yVel = -Math.abs(yVel);
					xVel = -Math.abs(xVel);
					
				}
				
				xVel = -xVel;
//				System.out.println("REGULAR CASE COLLISION");
				
			}
			}
		
		else if(x>=650 && x<=680) {
			if(y >= p2.getY() && y <=p2.getY() + p2.getLength() && xVel > 0) {
				if(y >=p2.getX() && y <= p2.getX()+20) {
					
					xVel = -4;
				}
				else {
					xVel = -xVel;
				}
				
			}
				
		}
			
	}
	
	
	public boolean checkPowerUpCollision(Powerup p) {
		if((y >= p.getY() && y <= p.getY() + 50) && (x >=p.getX() && x <= p.getX() + 50 )) {
			
				return true;
				
		}
		else {
			return false;
		}
	}



	public void move() {
		x+=xVel;
		y+=yVel;
		
		if(y<10)
			yVel=-yVel;
		if(y>490)
			yVel=-yVel;
	}
	
	public int getX() {
		return (int)x;
		
	}
	
	public int getY() {
		return (int)y;
	}
}
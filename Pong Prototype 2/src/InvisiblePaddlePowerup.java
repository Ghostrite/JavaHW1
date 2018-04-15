import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;


public class InvisiblePaddlePowerup extends Powerup{

	private Color color;
	private Color tempPColor;
	public Timer timer = new Timer();
	
	public InvisiblePaddlePowerup(HumanPaddle p1, HumanPaddle p2) {
		super(p1, p2);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		color = new Color(0,128,255);
		g.setColor(color);
		g.fillRect(x, y, 20, 20);
		
	}
		
		
	
	public Color getColor() {
		return color;
	}

	@Override
	public void effect(HumanPaddle p) {
		if (p.player == 1) {
			tempPColor = p2.color;
			p2.color = new Color(0,0,0);
			System.out.print("Invisible Effect on Player2");
			timer.schedule(new resetBoard(p2), 4000);
		}
		else {
			tempPColor = p1.color;
			p1.color = new Color(0,0,0);
			System.out.print("Invisible Effect on Player2");
			timer.schedule(new resetBoard(p1), 4000);
		}
		
		
		
	}
	
	
	
}

class resetBoard extends TimerTask{
	
	HumanPaddle p;
	
	resetBoard(HumanPaddle p){
		this.p = p;	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.color = new Color(255,255,255);
	}
	
	
	
	
	
}

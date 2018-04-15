import java.awt.Color;
import java.awt.Graphics;
import java.util.TimerTask;
import java.util.Timer;

public class IncreaseLengthPowerup extends Powerup{
	
	private Timer timer = new Timer();
	
	public IncreaseLengthPowerup(HumanPaddle p1, HumanPaddle p2) {
		super(p1, p2);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		color = new Color(174,255,20);
		g.setColor(color);
		g.fillRect(x, y, 20, 20);
		
	}

	@Override
	public void effect(HumanPaddle p) {
		// TODO Auto-generated method stub
		int temp = p.getLength();
		p.setLength(temp+80);
		p.setBound(p.getLength());
		timer.schedule(new resetLength(p), 10000);
	}


}


class resetLength extends TimerTask{
	
	HumanPaddle p;
	
	resetLength(HumanPaddle p){
		this.p = p;	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.setLength(80);
		p.setBound(80);
	}
	
}

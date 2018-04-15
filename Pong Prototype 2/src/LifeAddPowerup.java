import java.awt.Color;
import java.awt.Graphics;


public class LifeAddPowerup extends Powerup{
	
	private Color color;
	
	public LifeAddPowerup(HumanPaddle p1,HumanPaddle p2) {
		
		super(p1,p2);
		color = new Color(255,0,95);
	}
	
	@Override 
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 20, 20);
	}

	@Override
	public void effect(HumanPaddle p) {
		if (p.getLives() < 3) {
			p.lives +=1;
		}
	
	}
	
	public Color getColor() {
		return color;
	}
	
	
}

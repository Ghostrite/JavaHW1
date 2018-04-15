import java.util.ArrayList;
import java.util.TimerTask;

public class GeneratePowerup extends TimerTask{
	
	private ArrayList<Powerup> plist;
	private HumanPaddle p1,p2;
	
	public GeneratePowerup(ArrayList<Powerup> plist, HumanPaddle p1, HumanPaddle p2) {
		this.plist = plist;
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void run() {
		Powerup[] p = {new InvisiblePaddlePowerup(p1,p2),new IncreaseLengthPowerup(p1,p2), new LifeAddPowerup(p1,p2)};
		Powerup power = getRandomList(p);
		plist.add(power);
	}
	
	private Powerup getRandomList(Powerup[] p) {
		int index = (int) (Math.random()*p.length);
		return p[index];
	}
	
}

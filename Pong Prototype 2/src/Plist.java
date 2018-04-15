import java.util.ArrayList;

public class Plist {

	private ArrayList<Powerup> p;
	
	public Plist() {
		p = new ArrayList<Powerup>();
		
	}
	
	public void add(Powerup pup) {
		p.add(pup);
	}
	
	public Powerup remove(Powerup pup) {
		
		return p.remove(p.indexOf(pup));
	}
	
	public int getLength() {
		return p.size();
	}
	
	public Powerup getElement(int i) {
		
		return p.get(i);
	}
	
	public boolean checkCollision(Ball b) {
		
		for(int i=0;i<p.size();i++) {
			
			
			
		}
		
		
		return false;
	}
	
	public ArrayList<Powerup> getList() {
		
		return p;
	}
	
	
}

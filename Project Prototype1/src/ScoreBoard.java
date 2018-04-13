import java.awt.Color;
import java.awt.Graphics;

public class ScoreBoard {
	
	public ScoreBoard() {
		
		
	}
	public void drawHeart(Graphics g, int x, int y, int width, int height) {
	    int[] triangleX = {
	            x - 2*width/18,
	            x + width + 2*width/18,
	            (x - 2*width/18 + x + width + 2*width/18)/2};
	    int[] triangleY = { 
	            y + height - 2*height/3, 
	            y + height - 2*height/3, 
	            y + height };
	    g.fillOval(
	            x - width/12,
	            y, 
	            width/2 + width/6, 
	            height/2); 
	    g.fillOval(
	            x + width/2 - width/12,
	            y,
	            width/2 + width/6,
	            height/2);
	    g.fillPolygon(triangleX, triangleY, triangleX.length);
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(0, 500, 700, 500);
		g.drawString("Player1", 120, 515);
		g.drawString("Player2", 550, 515);
		g.drawLine(350, 500, 350, 650);
		g.drawRect(255, 510, 75, 75);
		g.drawRect(370, 510, 75, 75);
		
		
		
		
	}
	
	


}

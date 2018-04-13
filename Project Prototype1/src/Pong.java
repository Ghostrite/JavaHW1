
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Pong extends Applet implements Runnable, KeyListener {
	
	
	final int WIDTH = 700, HEIGHT = 600;
	
	Thread thread;
	HumanPaddle p1;
	HumanPaddle p2;
	ScoreBoard scoreB;
	Powerup life,l2;
	Plist list;
	
	Ball b1;
	boolean gameStarted;
	Graphics gfx;
	Image img;
	
	public void init() {
		this.resize(WIDTH,HEIGHT);
		gameStarted = false;
		
		this.addKeyListener(this);
		p1 = new HumanPaddle(1);
		p2 = new HumanPaddle(2);
		scoreB = new ScoreBoard();
		img = createImage(WIDTH, HEIGHT);
		gfx = img.getGraphics();
		b1 = new Ball();
		thread = new Thread(this);
		thread.start();
		life = new Powerup(p1);
		l2 = new Powerup(p1);
		list = new Plist();
		list.add(life);
		list.add(l2);
		
	}
	public void paint(Graphics g) {
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		if(b1.getX()< -10) {
			gfx.setColor(Color.red);
			gfx.drawString("Game Over", 350, 250);
			//Player 1 loses life
		}
		else if (b1.getX()>710) {
			gfx.setColor(Color.red);
			gfx.drawString("Game Over", 350, 250);
			//player 2 loses life
		}
		else {
		drawPowerup();
		p1.draw(gfx);
		p2.draw(gfx);
		b1.draw(gfx);
		scoreB.draw(gfx);
		scoreB.drawHeart(gfx, 20, 550, 40, 40);
		scoreB.drawHeart(gfx, 80, 550, 40, 40);
		scoreB.drawHeart(gfx, 140, 550, 40, 40);
		scoreB.drawHeart(gfx, 510, 550, 40, 40);
		scoreB.drawHeart(gfx, 570, 550, 40, 40);
		scoreB.drawHeart(gfx, 630, 550, 40, 40);
		
		}
		if(!gameStarted) {
			
		}
		g.drawImage(img, 0, 0, this);
	}
	
	public void drawPowerup() {
		for(int i=0;i < list.getLength();i++) {
			System.out.println(list.getLength());
			Powerup temp = list.getElement(i);
			temp.draw(gfx);
		}
	}
	
	public void update(Graphics g) {
		paint(g);
		
	}
	
	
	
	
	public void run() {
		for(;;) {
			if(gameStarted) {
			p1.move();
			p2.move();
			b1.move();
			b1.checkPaddleCollision(p1, p2);
			for(int i=0;i < list.getLength();i++) {
				if(b1.checkPowerUpCollision(list.getElement(i))){
					//removes power ups from list
				//list.remove(list.getElement(i));
				
				}
			
			}
			
			}
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(true);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(true);
			
		}
		else if (e.getKeyCode()== KeyEvent.VK_ENTER) {
			gameStarted = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p2.setUpAccel(true);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p2.setDownAccel(true);
			
		}
		//if (e.getKeyCode() == KeyEvent.VK_E) {
			
		//}
		//if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		
		//}
			
		
	}
	
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(false);
			
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p2.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p2.setDownAccel(false);
			
		}
		
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

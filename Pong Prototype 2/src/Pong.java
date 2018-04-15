
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
public class Pong extends Applet implements Runnable, KeyListener {
	
	
	final int WIDTH = 700, HEIGHT = 600;
	
	Thread thread;
	HumanPaddle p1;
	HumanPaddle p2;
	ScoreBoard scoreB;
	Powerup life,l2;
	Plist list;
	GeneratePowerup gp;
	Color powrupcolor;
	boolean gameWon = false;
	public Timer timer;
	String winner;
	
	Ball b1;
	boolean gameStarted;
	Graphics gfx;
	Image img;
	
	public void init() {
		this.resize(WIDTH,HEIGHT);
		this.addKeyListener(this);
		p1 = new HumanPaddle(1);
		p2 = new HumanPaddle(2);
		scoreB = new ScoreBoard();
		img = createImage(WIDTH, HEIGHT);
		gfx = img.getGraphics();
		b1 = new Ball();
		thread = new Thread(this);
		thread.start();
		list = new Plist();
		gameStarted = false;
		winner = "";
		
		
		/*Adding random powerups to the list of powerups on the screen*/
		
		
	}
	
	
	public void paint(Graphics g) {
		
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		if(b1.getX()< -10) {
			b1.x = 350;
			b1.y = 250;
			p1.lives -= 1;
			if(p1.lives == 0) {
		gfx.setColor(Color.red);
		b1.xVel = 0;
		b1.x = -350;
		b1.y = 250;
		b1.yVel = 0;
		gameStarted = false;
		removeAllPups();
		winner = "Player2 Wins!";
		timer.cancel();
		timer.purge();
			}
			//gfx.drawString("PLayer 1 Loses Life", 350, 250);
			//Player 1 loses life
		}
		else if (b1.getX()>710) {
			b1.x = 350;
			b1.y = 250;
			p2.lives -= 1;
			if(p2.lives == 0) {
				gameStarted = false;
				gfx.setColor(Color.red);
				gfx.drawString("Player 1 Wins", 350, 250);
				System.out.println("Hello world2");
				timer.cancel();
				timer.purge();
				removeAllPups();
				winner = "Player1 Wins!";
				b1.xVel = 0;
				b1.yVel = 0;
				b1.x = -350;
				b1.y = 250;
			}
			//gfx.setColor(Color.red);
			//gfx.drawString("Player 2 Loses Life", 350, 250);
			//player 2 loses life
		}
		
		else {
		//l2.effect(p2);
		drawPowerup();
		p1.draw(gfx);
		p2.draw(gfx);
		b1.draw(gfx);
		scoreB.draw(gfx);
//		scoreB.drawHeart(gfx, 20, 550, 40, 40);
//		scoreB.drawHeart(gfx, 80, 550, 40, 40);
//		scoreB.drawHeart(gfx, 140, 550, 40, 40);
		drawLives();
//		scoreB.drawHeart(gfx, 510, 550, 40, 40);
//		scoreB.drawHeart(gfx, 570, 550, 40, 40);
//		scoreB.drawHeart(gfx, 630, 550, 40, 40);
		//scoreB.setRectColor(powrupcolor);
		
		}
		
		if(!gameStarted) {
			gfx.setColor(Color.red);
			gfx.drawString("Pong", 310, 50);
			gfx.drawString(winner, 310, 80);
			gfx.drawString("Player1 controls", 100, 350);
			gfx.drawString("Player2 controls", 500, 350);
			gfx.drawString("W,S", 100, 370);
			gfx.drawString("D-- To Activate Powerup", 100, 390);
			gfx.drawString("Up_Arrow, Down_Arrow, Right_Arrow", 490, 370);
			gfx.drawString("Right_Arrow--To Activate Powerup", 490, 390);
			gfx.drawString("Hit enter to play!", 300, 450);
			
				
			
			
		}
		g.drawImage(img, 0, 0, this);
	}
	
	public void drawPowerup() {
		for(int i=0;i < list.getLength();i++) {
//			System.out.println(list.getLength());
			Powerup temp = list.getElement(i);
			temp.draw(gfx);
		}
	}
	
	private void resetPlayers() {
		p1.setLives(3);
		p2.setLives(3);
		p1.setLength(80);
		p2.setLength(80);
		p1.addPower(null);
		p2.addPower(null);
		removeAllPups ();
		p1.powerupDisplay(new Color (0,0,0));
		p2.powerupDisplay(new Color (0,0,0));
	}
	
	private void generatePowerup() {
//		Timer timer = new Timer();
		
	}
	
	public void update(Graphics g) {
		paint(g);
		
	}
	
	
	
	
	public void run() {
		while(!gameWon) {
			if(gameStarted) {
			p1.move();
			p2.move();
			b1.move();
			b1.checkPaddleCollision(p1, p2);
			for(int i=0;i < list.getLength();i++) {
				if(b1.checkPowerUpCollision(list.getElement(i))){
					Powerup temp = list.remove(list.getElement(i));
//					powrupcolor = temp.getColor();
					addPowerup(temp);
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
	
	
	private void addPowerup(Powerup p) {
		
		if(b1.xVel < 0) {
			p2.addPower(p);
			p2.powerupDisplay(p.getColor());
			System.out.println("player 2 has it");
		}
		else {
			p1.addPower(p);
			System.out.println("player 1 has it");
			p1.powerupDisplay(p.getColor());
		}
		
		
	}
	
	public void drawLives() {
		gfx.setColor(new Color(255,0,0));
		int tempp1x = 20;
		for(int i =0;i<p1.getLives();i++) {
			//System.out.println(p1.getLives());
			scoreB.drawHeart(gfx, tempp1x, 550, 40, 40);
			tempp1x+=60;
		}
		
		int tempp2x = 510;
		for(int i=0;i<p2.getLives();i++) {
			scoreB.drawHeart(gfx, tempp2x, 550, 40, 40);
			tempp2x+=60;
		}
		
		
	}
	private void removeAllPups () {
		for(int i=0;i < list.getLength();i++) {
			list.remove((list.getElement(i)));
		}
	}
	
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2.setUpAccel(true);
			
		}
		
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2.setDownAccel(true);
			
		}
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			try {
				p2.usePower().effect(p2);
			
			}
			
			catch(NullPointerException n) {
				
			}finally {
				p2.powerupDisplay(new Color (0,0,0));
				System.out.println("Player2 Used Powerup");
			}
			
		}
		
		
		else if (e.getKeyCode()== KeyEvent.VK_ENTER) {
			timer = new Timer();
			gp = new GeneratePowerup(list.getList(), p1, p2); 

			try {
				
				timer.scheduleAtFixedRate(gp, 5000, 5000);
				}
			
			catch(IllegalStateException i) {
				
				System.out.println(i);
				
			}finally {
			gameStarted = true;
			resetPlayers();
			b1 = new Ball();
			
			}
			
			
		}
		
		
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(true);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(true);
			
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			try {
				p1.usePower().effect(p1);
			
			}
			
			catch(NullPointerException n) {
				
			}finally {
				p1.powerupDisplay(new Color (0,0,0));
				System.out.println("Player1 Used Powerup");
			}
			
		}
		//if (e.getKeyCode() == KeyEvent.VK_E) {
			
		//}
		//if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		
		//}
			
		
	}
	
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2.setDownAccel(false);
			
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1.setUpAccel(false);
			
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDownAccel(false);
			
		}
		
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
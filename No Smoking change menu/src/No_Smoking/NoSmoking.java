package No_Smoking;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class NoSmoking extends JFrame{
	
	private Image screenimage;
	private Graphics screenGraphic;
	
	private Image NoSmoking;
	
	public NoSmoking() {
		setTitle("No Smoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		NoSmoking = new ImageIcon(Main.class.getResource("../images/Smoking1.png")).getImage();
	}
	
	public void paint(Graphics g){
		screenimage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenimage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenimage, 0, 0, null);		
	}
	
	public void screenDraw(Graphics g){
		g.drawImage(NoSmoking, 0, 0, null);
		this.repaint();
	}

}

package NoSmoking2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NoSmoking extends JFrame{
	
	//private static final Icon QuestList= null;
	private Image screenimage;
	private Graphics screenGraphic;
	
	private ImageIcon HelpButtonImage = new ImageIcon(Main.class.getResource("../images/HelpButton.jpg"));
	private ImageIcon QuestButtonImage = new ImageIcon(Main.class.getResource("../images/QuestButton.jpg"));
	private ImageIcon QuestListImage = new ImageIcon(Main.class.getResource("../images/QuestList.jpg"));
	private ImageIcon BackButtonImage = new ImageIcon(Main.class.getResource("../images/BackButton.png"));
	private ImageIcon FamousSayingImage = new ImageIcon(Main.class.getResource("../images/FamousSaying.png"));
	private ImageIcon TipImage = new ImageIcon(Main.class.getResource("../images/Tip.png"));

	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	
	//private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();
	private Image background = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton HelpButton = new JButton(HelpButtonImage);
	private JButton QuestButton = new JButton(QuestButtonImage);
	private JButton QuestList = new JButton(QuestListImage);
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton BackButton = new JButton(BackButtonImage);
	private JButton FamousSaying = new JButton(FamousSayingImage);
	private JButton Tip = new JButton(TipImage);

	
	private int mouseX, mouseY;
	

	
	public NoSmoking (){
		setUndecorated(true);
		setTitle("No Smoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		Dimension dim = new Dimension(200, 100);
		JFrame frame = new JFrame("ahah");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JLabel label = new JLabel();
		label.setText("setText Test");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		exitButton.setBounds(1250, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		add(exitButton);
		
		HelpButton.setBounds(100, 600, 250, 45);
		HelpButton.setBorderPainted(false);
		HelpButton.setContentAreaFilled(false);
		HelpButton.setFocusPainted(false);
		HelpButton.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//HelpButton.setIcon(HelpButtonImage);
				//HelpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				HelpButton.setIcon(HelpButtonImage);
				HelpButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				HelpButton.setVisible(false);
				QuestButton.setVisible(false);
				QuestList.setVisible(false);
				BackButton.setVisible(true);
				FamousSaying.setVisible(true);
				Tip.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/smoking_help.png")).getImage();
			}
		});
		add(HelpButton);
		
		
		
		QuestButton.setBounds(500, 600, 250, 45);
		QuestButton.setBorderPainted(false);
		QuestButton.setContentAreaFilled(false);
		QuestButton.setFocusPainted(false);
		QuestButton.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//QuestButton.setIcon(QuestButtonImage);
				//QuestButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				QuestButton.setIcon(QuestButtonImage);
				QuestButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				HelpButton.setVisible(false);
				QuestButton.setVisible(false);
				QuestList.setVisible(false);
				BackButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/smoking_quest.jpg")).getImage();
			}
		});
		add(QuestButton);
		
		QuestList.setBounds(900, 600, 250, 45);
		QuestList.setBorderPainted(false);
		QuestList.setContentAreaFilled(false);
		QuestList.setFocusPainted(false);
		QuestList.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//QuestList.setIcon(QuestListImage);
				//QuestList.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				QuestList.setIcon(QuestListImage);
				QuestList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				HelpButton.setVisible(false);
				QuestButton.setVisible(false);
				QuestList.setVisible(false);
				BackButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/background.png")).getImage();
			}
			
		});
		add(QuestList);
		
		BackButton.setBounds(60, 70, 60, 60);
		BackButton.setBorderPainted(false);
		BackButton.setContentAreaFilled(false);
		BackButton.setFocusPainted(false);
		BackButton.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//QuestList.setIcon(QuestListImage);
				//QuestList.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				BackButton.setIcon(BackButtonImage);
				BackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				HelpButton.setVisible(true);
				QuestButton.setVisible(true);
				QuestList.setVisible(true);
				BackButton.setVisible(false);
				FamousSaying.setVisible(false);
				Tip.setVisible(false);
				background = new ImageIcon(Main.class.getResource("../images/background.png")).getImage();
			}
			
		});
		add(BackButton);
		
		
		FamousSaying.setBounds(900, 600, 60, 60);
		FamousSaying.setBorderPainted(false);
		FamousSaying.setContentAreaFilled(false);
		FamousSaying.setFocusPainted(false);
		FamousSaying.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//QuestList.setIcon(QuestListImage);
				//QuestList.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				FamousSaying.setIcon(FamousSayingImage);
				FamousSaying.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				FamousSaying.setVisible(false);
				Tip.setVisible(false);
				//QuestList.setVisible(true);
				BackButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/Smoking1.png")).getImage();
				
			}
			
		});
		add(FamousSaying);
		
		
		Tip.setBounds(500, 600, 60, 60);
		Tip.setBorderPainted(false);
		Tip.setContentAreaFilled(false);
		Tip.setFocusPainted(false);
		Tip.addMouseListener(new MouseAdapter() {
			//@Override
			//public void mouseEntered(MouseEvent e) {
				//QuestList.setIcon(QuestListImage);
				//QuestList.setCursor(new Cursor(Cursor.HAND_CURSOR));
			//}
			@Override
			public void mouseExited(MouseEvent e) {
				Tip.setIcon(TipImage);
				Tip.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				FamousSaying.setVisible(false);
				Tip.setVisible(false);
				//QuestList.setVisible(true);
				BackButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/smoking_help.png")).getImage();
			
			}
			
		});
		add(Tip);
		
		//넣어야 하는게 팁백그라운드, 명언백그라운드, 명언박스, 팁박스
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
			
		});
		add(menuBar);

		BackButton.setVisible(false);
		FamousSaying.setVisible(false);
		Tip.setVisible(false);
		
	}
	
	public void paint(Graphics g){
		screenimage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenimage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenimage, 0, 0, null);		
	}
	
	public void screenDraw(Graphics g){
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	

}

package No_Smoking;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoSmoking extends JFrame{
	

	private Image screenimage;
	private Graphics screenGraphic;
	
	private ImageIcon HelpButtonImage = new ImageIcon(Main.class.getResource("../images/HelpButton.jpg"));
	private ImageIcon QuestButtonImage = new ImageIcon(Main.class.getResource("../images/QuestButton.jpg"));
	private ImageIcon QuestListImage = new ImageIcon(Main.class.getResource("../images/QuestList.jpg"));
	
	private ImageIcon HelpButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/HelpButtonEntered.jpg"));
	private ImageIcon QuestButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/QuestButtonEntered.jpg"));
	private ImageIcon QuestListEnteredImage = new ImageIcon(Main.class.getResource("../images/QuestListEntered.jpg"));
	
	private ImageIcon FamousSayingImage = new ImageIcon(Main.class.getResource("../images/FamousSaying.png"));
	private ImageIcon TipImage = new ImageIcon(Main.class.getResource("../images/Tip.png"));
	
	private ImageIcon FamousSayingEnteredImage = new ImageIcon(Main.class.getResource("../images/FamousSayingEntered.png"));
	private ImageIcon TipEnteredImage = new ImageIcon(Main.class.getResource("../images/TipEntered.png"));
	
	private ImageIcon BackButtonImage = new ImageIcon(Main.class.getResource("../images/BackButton.png"));
	private ImageIcon BackButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/BackEnteredButton.png"));
	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));

	
	private Image NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/Smoking1.png")).getImage();;
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton HelpButton = new JButton(HelpButtonImage);
	private JButton QuestButton = new JButton(QuestButtonImage);
	private JButton QuestList = new JButton(QuestListImage);
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton FamousSaying = new JButton(FamousSayingImage);
	private JButton Tip = new JButton(TipImage);
	private JButton BackButton = new JButton(BackButtonImage);
	
	
	private int mouseX, mouseY;
	

	
	public NoSmoking() {
		setUndecorated(true);
		setTitle("No Smoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
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
			@Override
			public void mouseEntered(MouseEvent e) {
				HelpButton.setIcon(HelpButtonEnteredImage);
				HelpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
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
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/Smoking2.png")).getImage();;
			
			}
		});
		add(HelpButton);
		
		QuestButton.setBounds(500, 600, 250, 45);
		QuestButton.setBorderPainted(false);
		QuestButton.setContentAreaFilled(false);
		QuestButton.setFocusPainted(false);
		QuestButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				QuestButton.setIcon(QuestButtonEnteredImage);
				QuestButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
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
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/Smoking3.png")).getImage();;
			}
		});
		add(QuestButton);
		
		QuestList.setBounds(900, 600, 250, 45);
		QuestList.setBorderPainted(false);
		QuestList.setContentAreaFilled(false);
		QuestList.setFocusPainted(false);
		QuestList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				QuestList.setIcon(QuestListEnteredImage);
				QuestList.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
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
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/Smoking4.png")).getImage();;
				}
		});
		add(QuestList);
		
		BackButton.setBounds(60, 70, 60, 60);
		BackButton.setBorderPainted(false);
		BackButton.setContentAreaFilled(false);
		BackButton.setFocusPainted(false);
		BackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BackButton.setIcon(BackButtonEnteredImage);
				BackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
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
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/Smoking1.png")).getImage();;
			}
			
		});
		add(BackButton);
		
		FamousSaying.setBounds(700, 500,  249, 194);
		FamousSaying.setBorderPainted(false);
		FamousSaying.setContentAreaFilled(false);
		FamousSaying.setFocusPainted(false);
		FamousSaying.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				FamousSaying.setIcon(FamousSayingEnteredImage);
				FamousSaying.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				FamousSaying.setIcon(FamousSayingImage);
				FamousSaying.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				FamousSaying.setVisible(false);
				Tip.setVisible(false);
				BackButton.setVisible(true);
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/FamousSayingBack.png")).getImage();
				
			}
			
		});
		add(FamousSaying);
		
		
		Tip.setBounds(300, 500, 249, 194);
		Tip.setBorderPainted(false);
		Tip.setContentAreaFilled(false);
		Tip.setFocusPainted(false);
		Tip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Tip.setIcon(TipEnteredImage);
				Tip.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Tip.setIcon(TipImage);
				Tip.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				FamousSaying.setVisible(false);
				Tip.setVisible(false);
				BackButton.setVisible(true);
				NoSmokingBackground = new ImageIcon(Main.class.getResource("../images/TipBack.png")).getImage();
			}
			
		});
		add(Tip);
		
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
		
		FamousSaying.setVisible(false);
		Tip.setVisible(false);
		BackButton.setVisible(false);

	}
	
	public void paint(Graphics g){
		screenimage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenimage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenimage, 0, 0, null);		
	}
	
	public void screenDraw(Graphics g){
		g.drawImage(NoSmokingBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}

}

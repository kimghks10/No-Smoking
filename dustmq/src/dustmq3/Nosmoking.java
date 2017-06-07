package dustmq3;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dustmq1.Main;

public class Nosmoking extends JFrame//gui프로그램을 만들기 위한 가장 기본적인 것
{
	private Image screenImage;
	private Graphics screenGraphic; //이 두 줄은 이미지를 담는것
	private Frame mainFrame;
	private Label geaderLabel;
	private Label statusLabel;
	private Panel controlpanel;
	
	


	private ImageIcon tipImage1 = new ImageIcon(Main.class.getResource("../images/backo.png"));
	private ImageIcon skrkrlskrkrl = 	new ImageIcon(Main.class.getResource("../images/skrkrl.png"));
	private ImageIcon skrkrlskrkrlqhffhr = 	new ImageIcon(Main.class.getResource("../images/skrkrlqhffhr.png"));
	private ImageIcon helpImage = new ImageIcon(Main.class.getResource("../images/help.jpg"));
	private ImageIcon helpdImage = new ImageIcon(Main.class.getResource("../images/helpd.jpg"));
	private ImageIcon quesetImage = new ImageIcon(Main.class.getResource("../images/queset.jpg"));
	private ImageIcon questdImage = new ImageIcon(Main.class.getResource("../images/questd.jpg"));
	private ImageIcon complexImage = new ImageIcon(Main.class.getResource("../images/complex.jpg"));
	private ImageIcon complexdImage = new ImageIcon(Main.class.getResource("../images/complexd.jpg"));
	private ImageIcon enlfhrkrlImage = new ImageIcon(Main.class.getResource("../images/enlfhrkrl.png"));
	private ImageIcon talkImage = new ImageIcon(Main.class.getResource("../images/talk.png"));
	private ImageIcon tipImage = new ImageIcon(Main.class.getResource("../images/tip.png"));

	
	
	
	private Image Background =  new ImageIcon(Main.class.getResource("../images/smoking.jpg")).getImage();//가져온 이미지를 담을 수 있는 하나의 객체
	private JLabel menuBar = new JLabel( new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	private JButton backo = new JButton(tipImage1);
	private JButton skrkrl = new JButton(skrkrlskrkrl);
	private JButton help = new JButton(helpImage);
	private JButton queset = new JButton(quesetImage);
	private JButton complex = new JButton(complexImage);
	private JButton enlfhrkrl = new JButton(enlfhrkrlImage);
	private JButton talk = new JButton(talkImage);
	private JButton tip = new JButton(tipImage);
	
	
	private int mouseX, mouseY;
	public Nosmoking()
	{
		setTitle("nosmoking");
		setUndecorated(true);//기본 메뉴바를 안보이게 해준다.
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);// 내가 지정한 크기가 변하지 않게 해준다
		setLocationRelativeTo(null); // 내가 만든 프로그램이 정중앙에 위치하게 해준다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임을 껏을 경우 프로그램이 종료하게 해주는 매우 중요한것
		setVisible(true);//우리가 만든 프로그램이 화면에 정상적으로 출력하세 도와주는 것		
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);//버튼이 제자리에 넣게 해준다.
		
		skrkrl.setBounds(1895, 0, 30, 30);
		skrkrl.setBorderPainted(false);
		skrkrl.setContentAreaFilled(false);
		skrkrl.setFocusPainted(false);
		skrkrl.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						skrkrl.setIcon(skrkrlskrkrlqhffhr);
						skrkrl.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						skrkrl.setIcon(skrkrlskrkrl);
						skrkrl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						System.exit(0);
					}
				});
		add(skrkrl);
		 
		
		help.setBounds(200, 950, 400, 100);
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		help.setFocusPainted(false);
		help.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						help.setIcon(helpdImage);
						help.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						help.setIcon(helpImage);
						help.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
					
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						help.setVisible(false);
						queset.setVisible(false);
						complex.setVisible(false);
						talk.setVisible(true);
						tip.setVisible(true);
						Background = new ImageIcon(Main.class.getResource("../images/backo.png")).getImage();	//가져온 이미지를 담을 수 있는 하나의 객체
					}
					
					/*@Override
					public void mousePressed(MouseEvent e)
					{
						System.exit(0);
					}*/
				});
		add(help);
		
		queset.setBounds(780, 950, 400, 100);
		queset.setBorderPainted(false);
		queset.setContentAreaFilled(false);
		queset.setFocusPainted(false);
		queset.addMouseListener(new MouseAdapter()
		
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						queset.setIcon(questdImage);
						queset.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						queset.setIcon(quesetImage);
						queset.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
				
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						help.setVisible(false);
						queset.setVisible(false);
						complex.setVisible(false);
						talk.setVisible(false);
						tip.setVisible(false);
						Background = new ImageIcon(Main.class.getResource("../images/backt.png")).getImage();	//가져온 이미지를 담을 수 있는 하나의 객체
					}
					/*@Override
					public void mousePressed(MouseEvent e)
					{
						System.exit(0);
					}*/
				});
		add(queset);
		
		complex.setBounds(1500, 950, 400, 100);
		complex.setBorderPainted(false);
		complex.setContentAreaFilled(false);
		complex.setFocusPainted(false);
		complex.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						complex.setIcon(complexdImage);
						complex.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						complex.setIcon(complexImage);
						complex.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						help.setVisible(false);
						queset.setVisible(false);
						complex.setVisible(false);
						talk.setVisible(false);
						tip.setVisible(false);
						Background = new ImageIcon(Main.class.getResource("../images/backh.png")).getImage();	//가져온 이미지를 담을 수 있는 하나의 객체
					}
					/*@Override
					public void mousePressed(MouseEvent e)
					{
						System.exit(0);
					}*/
				});
		add(complex);
		
		enlfhrkrl.setBounds(60, 70, 60, 60);
		enlfhrkrl.setBorderPainted(false);
		enlfhrkrl.setContentAreaFilled(false);
		enlfhrkrl.setFocusPainted(false);
		enlfhrkrl.addMouseListener(new MouseAdapter() {
	         
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	 enlfhrkrl.setIcon(enlfhrkrlImage);
	        	 enlfhrkrl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	            help.setVisible(true);
	            queset.setVisible(true);
	            complex.setVisible(true);
	            talk.setVisible(false);
	            tip.setVisible(false);
	            Background = new ImageIcon(Main.class.getResource("../images/smoking.jpg")).getImage();
	         }
	         
	      });
	      add(enlfhrkrl);
	      
	    talk.setBounds(200, 550, 400, 500);
		talk.setBorderPainted(false);
		talk.setContentAreaFilled(false);
		talk.setFocusPainted(false);
		talk.addMouseListener(new MouseAdapter()
		{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						talk.setIcon(talkImage);
						talk.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						talk.setIcon(talkImage);
						talk.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
					
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						help.setVisible(false);
						queset.setVisible(false);
						complex.setVisible(false);
						enlfhrkrl.setVisible(true);
						talk.setVisible(false);
						tip.setVisible(false);
						Background = new ImageIcon(Main.class.getResource("../images/backo.png")).getImage();//가져온 이미지를 담을 수 있는 하나의 객체
						
						
			            backo.setVisible(true);
					
					}
					
					
		});
					
		add(talk);
		
		tip.setBounds(200, 100, 1800, 500);
		tip.setBorderPainted(false);
		tip.setContentAreaFilled(false);
		tip.setFocusPainted(false);
		tip.addMouseListener(new MouseAdapter()
		{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						tip.setIcon(tipImage);
						tip.setCursor(new Cursor(Cursor.HAND_CURSOR));//마우스가 올라갔을때 손가락 모양을 ㅗ바뀌고	
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						tip.setIcon(tipImage);
						tip.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
					
					}
					@Override
					public void mousePressed(MouseEvent e)
					{
						help.setVisible(false);
						queset.setVisible(false);
						complex.setVisible(false);
						enlfhrkrl.setVisible(true);
						talk.setVisible(false);
						tip.setVisible(false);
						
						Background = new ImageIcon(Main.class.getResource("../images/backo.png")).getImage();	//가져온 이미지를 담을 수 있는 하나의 객체
						backo.setVisible(true);
			           
					}
					
					
		});
					
		add(tip);
		
		
	
		
		menuBar.setBounds(0, 0, 1980, 30);//메뉴바의 위치
		menuBar.addMouseListener(new MouseAdapter()
				{
					@Override//마우스를 해당버튼을 눌렀을때 무슨 이벤트인지
					public void mousePressed(MouseEvent e)
					{
						mouseX = e.getX();
						mouseY = e.getY();
					}
				});
		menuBar.addMouseMotionListener(new MouseMotionAdapter()
				{
					@Override
					public void mouseDragged(MouseEvent e)
					{
						int x = e.getXOnScreen();
						int y = e.getYOnScreen();
						setLocation(x - mouseX, y - mouseY);//내가 드래그 하는곳을 게임창을 이동해주는 것
						
					}
				});
		add(menuBar);//메뉴바를 추가해준다
		
		
		
		talk.setVisible(false);
		tip.setVisible(false);
		//메인클레스의 위치를 기반으로 해서 스모킹이라는 사진을 얻어온 다음에 사용하겠다는것
		
	}
	
	
	
	public void paint(Graphics g)
	{
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//스크린의 크기만큼만들어준다음에 그것을 스크린 이미지에 넣어주겠다는 것
		screenGraphic = screenImage.getGraphics();// 이 사진을 이용해 그래픽 개체를 얻어돈다	
		screenDraw(screenGraphic);//스크린 드로우에서 스크린 그래픽에 어떠한 그림을그려준다
		g.drawImage(screenImage, 0, 0, null);//스크린 이미지를 영컴ㅁ마 영 위치에 그려준다
		
	}
	public void screenDraw(Graphics g)
	{
		g.drawImage(Background, 0, 0, null);//드로우 이미지에 이트로 백그라운드를 스크린 이미제에 그려준다
		paintComponents(g);
		this.repaint();//페인트는 제이프레임을 상속받은 가장 첫번쨰로 그려주는 함수 프로그램화면 만큼 이미지를 생서해서 우리가우너하는 그림을 그려준다 이게 스크린 드로우 인데 이게 영컴마 영이다. 이게 리페인트를 해줌으로써  즉 전체화며녀이미지를 프로그램이종료될떄까지 반복되는것
		
	}	
}

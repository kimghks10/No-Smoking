package dustmq2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import dustmq1.Main;

public class Nosmoking extends JFrame//gui프로그램을 만들기 위한 가장 기본적인 것
{
	
	private Image screenImage;
	private Graphics screenGraphic; //이 두 줄은 이미지를 담는것
	
	private Image introBackground;//가져온 이미지를 담을 수 있는 하나의 객체
	
	public Nosmoking()
	{
		setTitle("nosmoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);// 내가 지정한 크기가 변하지 않게 해준다
		setLocationRelativeTo(null); // 내가 만든 프로그램이 정중앙에 위치하게 해준다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임을 껏을 경우 프로그램이 종료하게 해주는 매우 중요한것
		setVisible(true);//우리가 만든 프로그램이 화면에 정상적으로 출력하세 도와주는 것		
		
		introBackground = new ImageIcon(Main.class.getResource("../images/smoking.png")).getImage();//메인클레스의 위치를 기반으로 해서 스모킹이라는 사진을 얻어온 다음에 사용하겠다는것
		
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
		g.drawImage(introBackground, 0, 0, null);//드로우 이미지에 이트로 백그라운드를 스크린 이미제에 그려준다
		this.repaint();//페인트는 제이프레임을 상속받은 가장 첫번쨰로 그려주는 함수 프로그램화면 만큼 이미지를 생서해서 우리가우너하는 그림을 그려준다 이게 스크린 드로우 인데 이게 영컴마 영이다. 이게 리페인트를 해줌으로써  즉 전체화며녀이미지를 프로그램이종료될떄까지 반복되는것
		
	}	
}

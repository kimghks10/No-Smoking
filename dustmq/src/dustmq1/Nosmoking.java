package dustmq1;

import javax.swing.JFrame;

public class Nosmoking extends JFrame//gui프로그램을 만들기 위한 가장 기본적인 것
{
	public Nosmoking()
	{
		setTitle("nosmoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);// 내가 지정한 크기가 변하지 않게 해준다
		setLocationRelativeTo(null); // 내가 만든 프로그램이 정중앙에 위치하게 해준다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임을 껏을 경우 프로그램이 종료하게 해주는 매우 중요한것
		setVisible(true);//우리가 만든 프로그램이 화면에 정상적으로 출력하세 도와주는 것		
	}


		
}

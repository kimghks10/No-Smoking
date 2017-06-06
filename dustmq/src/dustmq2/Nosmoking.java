package dustmq2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import dustmq1.Main;

public class Nosmoking extends JFrame//gui���α׷��� ����� ���� ���� �⺻���� ��
{
	
	private Image screenImage;
	private Graphics screenGraphic; //�� �� ���� �̹����� ��°�
	
	private Image introBackground;//������ �̹����� ���� �� �ִ� �ϳ��� ��ü
	
	public Nosmoking()
	{
		setTitle("nosmoking");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);// ���� ������ ũ�Ⱑ ������ �ʰ� ���ش�
		setLocationRelativeTo(null); // ���� ���� ���α׷��� ���߾ӿ� ��ġ�ϰ� ���ش�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ������ ���� ��� ���α׷��� �����ϰ� ���ִ� �ſ� �߿��Ѱ�
		setVisible(true);//�츮�� ���� ���α׷��� ȭ�鿡 ���������� ����ϼ� �����ִ� ��		
		
		introBackground = new ImageIcon(Main.class.getResource("../images/smoking.png")).getImage();//����Ŭ������ ��ġ�� ������� �ؼ� ����ŷ�̶�� ������ ���� ������ ����ϰڴٴ°�
		
	}
	public void paint(Graphics g)
	{
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);//��ũ���� ũ�⸸ŭ������ش����� �װ��� ��ũ�� �̹����� �־��ְڴٴ� ��
		screenGraphic = screenImage.getGraphics();// �� ������ �̿��� �׷��� ��ü�� ����	
		screenDraw(screenGraphic);//��ũ�� ��ο쿡�� ��ũ�� �׷��ȿ� ��� �׸����׷��ش�
		g.drawImage(screenImage, 0, 0, null);//��ũ�� �̹����� ���Ĥ��� �� ��ġ�� �׷��ش�
		
	}
	public void screenDraw(Graphics g)
	{
		g.drawImage(introBackground, 0, 0, null);//��ο� �̹����� ��Ʈ�� ��׶��带 ��ũ�� �̹����� �׷��ش�
		this.repaint();//����Ʈ�� ������������ ��ӹ��� ���� ù������ �׷��ִ� �Լ� ���α׷�ȭ�� ��ŭ �̹����� �����ؼ� �츮������ϴ� �׸��� �׷��ش� �̰� ��ũ�� ��ο� �ε� �̰� ���ĸ� ���̴�. �̰� ������Ʈ�� �������ν�  �� ��üȭ����̹����� ���α׷�������ɋ����� �ݺ��Ǵ°�
		
	}	
}

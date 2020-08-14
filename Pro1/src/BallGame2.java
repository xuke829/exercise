import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100;
	double y=100;
	double degree = 3.14/3; //����
	public void paint(Graphics g) {
		//System.out.println("���ڱ�����һ��");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x=x+1*Math.cos(degree);
		y=y+Math.sin(degree);
		if(y>500-70||y<80) {
			degree = -degree;
		}
		if(x< 0||x>856-70) {
			degree = 3.14-degree;
		}
		
	}
	//���ڼ���
	
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ�����
		while(true) {
			repaint();
			try {
				Thread.sleep(40);  //40ms һ�뻭25�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}

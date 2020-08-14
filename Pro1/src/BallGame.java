import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100;
	double y=100;
	boolean right = true;
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		if(right) {
			x=x+1;
		}else {
			x=x-1;
		}
		if(x>856-40-30) {
			right=false;
		}
		if(x<40) {
			right = true;
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
		BallGame game = new BallGame();
		game.launchFrame();
	}
}

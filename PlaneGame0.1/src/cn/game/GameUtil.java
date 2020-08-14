package cn.game;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.*;
import javax.imageio.ImageIO;

public class GameUtil {
	private GameUtil() {
		
	}
	public static Image getImage(String path) {
		BufferedImage bi =null;
		try {
			URL u=GameUtil.class.getClassLoader().getResource(path);
			bi = ImageIO.read(u);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
}

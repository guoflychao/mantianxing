package star;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;

public class Star {
public static void main(String[] args) {
	JFrame jf=new JFrame();
	jf.setSize(1600, 900);
	jf.getContentPane().setBackground(Color.BLACK);
	Mypanel mp=new Mypanel();
	jf.add(mp);
	jf.setVisible(true);
}

}
/**
 * 创建一个类继承Panel，画星星
 * @author guochao
 *
 */
class Mypanel extends Panel{
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(1300, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(1300, 100, 100, 80);
		g.setColor(Color.WHITE);
		for (int i = 0; i < 300; i++) {
			g.drawString("*", (int)(Math.random()*1600),(int)(Math.random()*900));
			
		}
		g.setColor(Color.RED);
		g.setFont(new Font(null,0 , 100));
		g.drawString("美好的一天从现在开始", 300, 500);
	}
}
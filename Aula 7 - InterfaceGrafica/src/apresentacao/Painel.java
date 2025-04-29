package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		//Ceu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1024, 500);
		
		//Chao
		g.setColor(Color.green);
		g.fillRect(0, 500, 1024, 268);

		//Sol
		g.setColor(Color.yellow);
		g.fillOval(835, 50, 85, 85);

		//Casa
		g.setColor(Color.gray);
		g.drawRect(200, 400, 100, 100);
		
		//Telhado
		g.drawLine(200, 400, 250, 350);
		g.drawLine(300, 400, 250, 350);
		g.drawLine(350, 350, 400, 400);
		
		//Lateral
		
		g.drawLine(300, 500, 400, 500);
		g.drawLine(300, 400, 400, 400);
		g.drawLine(400, 500, 400, 400);
		
		//Superior
		
		g.drawLine(250, 350, 350, 350);
		
	}
}
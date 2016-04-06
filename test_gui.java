

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test_gui extends JPanel {
	
	private BufferedImage bi;	
	Graphics2D big;


	public test_gui() {
		bi = new BufferedImage(400, 600, BufferedImage.TYPE_INT_ARGB);
		big = (Graphics2D) bi.getGraphics();
		big.setBackground(Color.BLACK);
	}	

	
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		//frame.getContentPane().setLayout(new BorderLayout());
		
		//SpaceShip v = new SpaceShip(180, 550, 20, 20);
		//GamePanel gp = new GamePanel();
		//GameEngine engine = new GameEngine(gp, v);
		//frame.addKeyListener(engine);
		//frame.getContentPane().add(gp, BorderLayout.CENTER);
		//frame.setVisible(true);
		
		//engine.start();
	}

	
}
	
package tictactoe;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	public static void main(String args[]) throws InterruptedException {
		Window foo = new Window("tic-tac-toe", 512, 512);
		while (true) {
			Thread.sleep(100);
			foo.render();


			
		}
	}
	
	private JFrame frame;
	private Canvas canvas;
	private MyMouseListener mml = new MyMouseListener();
	
	
	private String title;
	private int width, height;
	
	public Window(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createWindow();
	}
	
	private void createWindow() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		canvas.addMouseListener(mml);
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	private BufferStrategy bs;
	private Graphics g;

private void render() {
	bs = canvas.getBufferStrategy();
	if(bs == null) {
		canvas.createBufferStrategy(3);
		return;
	}
	
	g = bs.getDrawGraphics();
	
	g.clearRect(0, 0, width, height);
	
	//Draw start
	g.drawLine(width/3, 0, width/3, height);
	g.drawLine(2*width/3, 0, 2*width/3, height);
	g.drawLine(0, height/3, width, height/3);
	g.drawLine(0, 2*height/3, width, 2*height/3);

	//draw end

	bs.show();
	g.dispose();
}

}
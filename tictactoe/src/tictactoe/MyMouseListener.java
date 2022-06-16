package tictactoe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener {

//	public boolean thingy;
	@Override
	public void mouseClicked(MouseEvent e) { 
		System.out.println("click1");
	}

	@Override
	public void mouseEntered(MouseEvent e) { 
		System.out.println("click2");
	}

	@Override
	public void mouseExited(MouseEvent e) { 
		System.out.println("click3");
	}

	@Override
	public void mousePressed(MouseEvent e) { 
		System.out.println("click4");
	}

	@Override
	public void mouseReleased(MouseEvent e) { 
		System.out.println("click5");
	}

}
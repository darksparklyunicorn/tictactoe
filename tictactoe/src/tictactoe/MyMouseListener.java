package tictactoe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyMouseListener implements MouseListener {

	private GameLogic gameInstance;
	private int width, height;
	public MyMouseListener(GameLogic g, int width, int height) {
		this.gameInstance = g;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) { 
		int playerIn = e.getX()*3/width;
		if (playerIn < 3)
			playerIn++;
		int playery = e.getY()*3/height;
		playerIn += (playery == 3)? 6:3*playery;
		System.out.println(playerIn);
		gameInstance.takeInput(playerIn);
	}

	@Override
	public void mouseEntered(MouseEvent e) { 
//		System.out.println("click2");
	}

	@Override
	public void mouseExited(MouseEvent e) { 
//		System.out.println("click3");
	}

	@Override
	public void mousePressed(MouseEvent e) { 
//		System.out.println("click4");
	}

	@Override
	public void mouseReleased(MouseEvent e) { 
//		System.out.println("click5");
	}

}
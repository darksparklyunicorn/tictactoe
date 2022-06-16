package tictactoe;

public class GameLogic {
	private int player1, player2;
	private boolean isP1Turn;
	private final static int[] WINSTATES = {14, 14<<3, 14<<3, 146, 146<<1, 146<<2, 546, 168};

	public GameLogic() {
		this.player1 = 0;
		this.player2 = 0;
		this.isP1Turn = true;

	}
	
	public void takeInput(int playerInput) {
		if (isP1Turn) {
			player1 = checkMove(player1, playerInput);
			if ((player1 & 1) == 1) 
				System.out.println("player 1 won");
		}
		else { player2 = checkMove(player2, playerInput);
		if ((player2 & 1) == 1) 
			System.out.println("player 2 won");
		}
//		System.out.printf("%d, %d%n", player1, player2);
	}
	private int checkMove(int player, int playerInput) {
		if ((player & 1<<playerInput) == 0) {//move valid
			player |= 1<<playerInput; //store move to player data
			for(int i:WINSTATES)      //check for win
				if (player == i)
					player++;
			isP1Turn = !isP1Turn;     //update player turn
		}
		return player;
		
	}

}

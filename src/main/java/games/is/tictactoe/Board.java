package is.game.tictactoe;

public class Board{
	private byte movesLeft;
	private byte[][] board;

	//Class constructor
	public Board(){
		this.setMovesLeft(9);
		this.board = new byte[3][3];
		this.resetBoard();
	}

	protected byte getMovesLeft(){
		return this.movesLeft;
	}

	protected byte setMovesLeft(byte moves){
		this.movesLeft = moves;
	}

	//Set up the board for use in game
	protected void resetBoard(){

	}

	//Attempts to make a move on board based on input
	protected void makeMove(byte cell){

	}

	//Check if cell is available
	protected boolean cellAvailable(byte cell){
		return false;
	}

	//Check for victory
	protected boolean checkVictory(){
		return false;
	}

	//Checks rows for victory
	protected boolean checkHorizontal(){
		return false;
	}

	//Checks columns for victory
	protected boolean checkVertical(){
		return false;
	}

	//Checks diagonal lines for victory
	protected boolean checkDiagonal(){
		return false;
	}

}
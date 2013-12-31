package is.game.tictactoe;

public class Board{
	private int movesLeft;
	private int[][] board;

	//Class constructor
	public Board(){
		this.setMovesLeft(9);
		this.board = new int[3][3];
		this.resetBoard();
	}

	protected int getMovesLeft(){
		return this.movesLeft;
	}

	protected void setMovesLeft(int moves){
		this.movesLeft = moves;
	}

	//Set up the board for use in game
	protected void resetBoard(){

	}

	//Attempts to make a move on board based on input
	protected void makeMove(int cell){

	}

	//Check if cell is available
	protected boolean cellAvailable(int cell){
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
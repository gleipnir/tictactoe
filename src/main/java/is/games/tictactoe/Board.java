package is.game.tictactoe;

public class Board{
	private int movesLeft;
	private char[][] board;

	//Class constructor
	public Board(){
		this.setMovesLeft(9);
		this.board = new char[3][3];
		this.resetBoard();
	}

	protected int getMovesLeft(){
		return this.movesLeft;
	}

	protected void setMovesLeft(int moves){
		if(moves < 10 && moves >= 0){
			this.movesLeft = moves;
		}
	}

	protected char[][] getBoard(){
		return board;
	}

	//Set up the board for use in game
	protected void resetBoard(){
		int counter = 1;

		for(int row = 0; row < 3; row++){
			for(int column = 0; column < 3; column++){
				board[row][column] = (char)(counter + '0');
				counter++;
			}
		}
	}

	//Attempts to make a move on board based on input
	protected boolean makeMove(int cell, char mark){
		for(int row = 0; row < 3; row++){
			for(int column = 0; column < 3; column++){
				if(board[row][column] == (char)(cell + '0')){
					board[row][column] = mark;
					return true;
				}
			}
		}

		return false;
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
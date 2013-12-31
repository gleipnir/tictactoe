package is.game.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest{
	Board board;

	@Test
	public void setMovesTest(){
		board = new Board();

		board.setMovesLeft(10);
		assertEquals(9, board.getMovesLeft());

		board.setMovesLeft(-1);
		assertEquals(9, board.getMovesLeft());

		for(int i = 0; i < 10; i++){
			board.setMovesLeft(i);
			assertEquals(i, board.getMovesLeft());
		}
	}

	//Each cell in the board should be numbered from 1 to 9
	@Test
	public void resetBoardTest(){
		board = new Board();

		int counter = 1;
		//Check if default values are set
		for(int row = 0; row < 3; row++){
			for(int column = 0; column < 3; column++){
				assertEquals((char)(counter + '0') ,board.getBoard()[row][column]);
				counter++;
			}
		}
	}

	//If a cell does not have its default character in it then
	//makeMove should return false
	@Test
	public void makeMoveTest(){
		board = new Board();
		char mark = 'X';
		boolean result;

		//Board now has all default values
		for(int i = 1; i < 10; i++){
			result = board.makeMove(i, mark);
			assertEquals(true, result);
		}

		for(int row = 0; row < 2; row++){
			for(int column = 0; column < 2; column++){
				assertEquals(mark, board.getBoard()[row][column]);
			}
		}
	}
}
package tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import Main.GameBoard;

public class Board_test {
	
	@Test
    public void testBoardPositionValue() {
		GameBoard gameBoard = new GameBoard();
		int x = 2;
		int y = 1;
		int playerPosition = gameBoard.getValueOfPosition(x, y);
		assertEquals(2, playerPosition);
    }

    @Test
	public void testSetValueOfPositionMethod(){
		GameBoard gameBoard = new GameBoard();
		assertEquals("Initial value on player start position should be 2",2,gameBoard.getValueOfPosition(2,1));
		gameBoard.setValueOfPosition(2,1,9);
		assertEquals("Initial value on player start position should now be 9",9,gameBoard.getValueOfPosition(2,1));
	}
}

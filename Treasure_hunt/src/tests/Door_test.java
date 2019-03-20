package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Main.GameBoard;

public class Door_test {
	
	@Test
	public void onlyOneDoorAtBoard() {
		
	}
	
	@Test
	public void doorDisabled() {
		
	}
	
	@Test
	public void doorEnabled() {
		GameBoard gameBoard = new GameBoard();
		int x = 8;
		int y = 21;
		int doorPosition = gameBoard.getValueOfPosition(x, y);
		assertEquals(4, doorPosition);
	}
}

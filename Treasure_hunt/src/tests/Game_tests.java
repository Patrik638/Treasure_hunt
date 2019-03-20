package tests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import Main.GameBoard;

public class Game_tests {
	
	@Test
    public void testBoardPositionValue() {
		GameBoard gameBoard = new GameBoard();
		int x = 2;
		int y = 1;
		int playerPosition = gameBoard.getPosition(x, y);
		assertEquals(2, playerPosition);
    }
}

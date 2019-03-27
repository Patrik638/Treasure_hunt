package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Main.GameSession;
import Main.Treasure;

public class Treasure_test {
	
	GameSession testGameSession = new GameSession();

	@Test
	public void treasureFound() {
		Treasure treasure = new Treasure();
		assertEquals("Expecting 6 treasure to exist",6,testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());
		treasure.treasureFounded(3, 5);
		assertEquals("Expecting 5 treasure to exist",5,testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());	
	}
	
	@Test
	public void treasureCounter() {
		assertEquals("Expecting 6 treasure to exist",6,testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());
	}
}

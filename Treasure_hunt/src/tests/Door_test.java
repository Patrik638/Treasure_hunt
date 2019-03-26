package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Main.Door;
import Main.GameSession;

public class Door_test {
	
	GameSession testGameSession = new GameSession();
	
	@Test
	public void onlyOneDoorAtBoard() {
		Door door = new Door();
		int doorsFound = 0;
		assertEquals("Expecting one door to exist",1,door.doorAtBoard(doorsFound));
	}
	
	@Test
	public void doorDisabled() {
		testGameSession.gameBoard.setValueOfPosition(8, 29, 1);
		assertEquals("Door not enabled",1,testGameSession.gameBoard.getValueOfPosition(8, 29));
	}
	
	@Test
	public void doorEnabled() {
		Door door = new Door();
		assertTrue(door.isDoorEnabled(8, 29));
	}
}

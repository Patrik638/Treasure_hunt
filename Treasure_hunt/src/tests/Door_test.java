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
		int doorsFound = 0;
		for (int row = 0; row< testGameSession.gameBoard.getNumberOfRows(); row++){
			for(int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++){
				if (testGameSession.gameBoard.getValueOfPosition(row,col)==2){
					doorsFound++;
				}
			}
		}
		assertEquals("Expecting one door to exist",1,doorsFound);
	}
	
	@Test
	public void doorDisabled() {
		Door door = new Door();
		assertFalse(door.isDoorEnabled(8, 29));
	}
	
	@Test
	public void doorEnabled() {
		Door door = new Door();
		assertTrue(door.isDoorEnabled(8, 29));
	}
}

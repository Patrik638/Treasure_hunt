package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Main.GameSession;

public class Door_test {
	
	GameSession testGameSession = new GameSession();
	
	@Test
	public void doorDisabled() {
		testGameSession.gameBoard.disableDoor(8, 29);
		assertEquals("Door not enabled",1,testGameSession.gameBoard.getValueOfPosition(8, 29));
	}
	
	@Test
	public void doorEnabled_Yes() {
		testGameSession.gameBoard.checkToOpenDoor(0);
		assertEquals("Door is enabled",4,testGameSession.gameBoard.getValueOfPosition(8, 29));
	}
	
	@Test
	public void doorEnabled_No() {
		testGameSession.gameBoard.disableDoor(8, 29);
		testGameSession.gameBoard.checkToOpenDoor(1);
		assertEquals("Door is not enabled",1,testGameSession.gameBoard.getValueOfPosition(8, 29));
	}
}

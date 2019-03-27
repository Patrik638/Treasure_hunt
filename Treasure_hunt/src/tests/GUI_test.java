package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Main.GameSession;

public class GUI_test {
	
	GameSession testGameSession = new GameSession();
	
	@Test
	public void jTextAreaShowText() throws InterruptedException {
		int expectedValue = 3;
		testGameSession.frame.setVisible(true);
		assertNotNull(testGameSession.text);
		testGameSession.gameBoard.getValueOfPosition(1, 11);
		Thread.sleep(100);
		assertEquals(expectedValue, testGameSession.gameBoard.getValueOfPosition(1, 11));
	}
	
	@Test
	public void frameShowingCorrect()
	    {
	        int frameHeight = testGameSession.frame.getHeight();
	        int frameWidth = testGameSession.frame.getWidth();
	        assertEquals(650,frameHeight);
	        assertEquals(600,frameWidth);
	        int textHeight = testGameSession.text.getHeight();
	        int textWidth = testGameSession.text.getWidth();
	        assertEquals(550,textHeight);
	        assertEquals(550,textWidth);
	    }
}

package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.GameSession;

public class GUI_test {
	
	GameSession testGameSession = new GameSession();
	
	@Test
	public void jTextAreaShowText() throws InterruptedException {
		String expectedText = "Test of JTextArea";
		testGameSession.frame.setVisible(true);
		assertNotNull(testGameSession.text);
		testGameSession.text.setText("Test of JTextArea");
		assertEquals(expectedText, testGameSession.text.getText());
	}
	
	@Test
	public void frameShowingCorrect()
	    {
	        int frameHeight = testGameSession.frame.getHeight();
	        int frameWidth = testGameSession.frame.getWidth();
	        assertEquals(620,frameHeight);
	        assertEquals(460,frameWidth);
	        int textHeight = testGameSession.text.getHeight();
	        int textWidth = testGameSession.text.getWidth();
	        assertEquals(550,textHeight);
	        assertEquals(400,textWidth);
	    }
}

package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Main.GameSession;

public class Treasure_test {

    GameSession testGameSession = new GameSession();

    @Test
    public void treasureFound() {
        assertEquals("Expecting 6 treasure to exist", 6, testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());
        testGameSession.gameBoard.setValueOfPosition(3, 5, 0);
        assertEquals("Expecting 5 treasure to exist", 5, testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());
    }

    @Test
    public void treasureCounter() {
        assertEquals("Expecting 6 treasure to exist", 6, testGameSession.gameBoard.numberOfCurrentTreasureOnBoard());
    }
}

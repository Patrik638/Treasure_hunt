package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Main.GameSession;
import Main.GameTimer;
import Main.Laser;

public class Laser_test {

	GameSession testGameSession = new GameSession();

	@Test
	public void LasersExistsAtBoard() {
		int lasersFound = 0;
		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (testGameSession.gameBoard.getValueOfPosition(row, col) == 5)

					lasersFound++;

			}
		}

		assertEquals("Finding all lasers on Game board", 14, lasersFound);

	}

	@Test
	public void laserIsDisabled() throws InterruptedException {
		Laser laser = new Laser();
		GameSession testGameSession = new GameSession();
		GameTimer testGameTimer = new GameTimer();
		long Actual = testGameTimer.CurentTimer();
		long ExpectedS = 6;
		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (testGameSession.gameBoard.getValueOfPosition(row, col) == 5)
					assertEquals(ExpectedS, Actual, 0);

			}
		}

	}

	// Checking laser on board
	@Test
	public void laser1Enabled() {

		Laser laser = new Laser();

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (testGameSession.gameBoard.getValueOfPosition(row, col) == 5)
					assertTrue(laser.isLaserEnabled(row, col));
			}

		}

	}

}

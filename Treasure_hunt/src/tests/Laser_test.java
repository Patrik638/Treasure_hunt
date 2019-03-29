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

	@SuppressWarnings("static-access")
	@Test
	public void laserOneIsDisabled() {
		GameTimer gameTimer = new GameTimer();
		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {
				if (gameTimer.CurentTimer() <= 6000 && row == 4)

					for (col = 7; col < 12; col++) {

						testGameSession.gameBoard.disableLaser(row, col);

						assertEquals("Laser one is disabled", 1,
								testGameSession.gameBoard.getValueOfPosition(row, col));
					}

			}
		}
	}

	@Test
	public void laserTwoIsDisabled() {
		GameTimer gameTimer = new GameTimer();
		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (gameTimer.CurentTimer() <= 8000 && col == 15)

					for (row = 2; row < 5; row++) {

						testGameSession.gameBoard.disableLaser(row, col);

						assertEquals("Laser Two is disabled", 1,
								testGameSession.gameBoard.getValueOfPosition(row, col));

					}
			}
		}
	}

//	@SuppressWarnings("static-access")
//	@Test
//	public void laserOneIsEnabled() {
//		GameTimer gameTimer = new GameTimer();
//		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
//			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {
//				while (row == 4)
//					for (col = 7; col < 12; col++) {
//						if (gameTimer.CurentTimer() >= 7000)
//							testGameSession.gameBoard.enableLaser(row, col);
//						assertEquals("Laser one is Enabled", 5,
//								testGameSession.gameBoard.getValueOfPosition(row, col));
//					}
//
//			}
//		}
//	}

}

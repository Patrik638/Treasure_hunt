package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Main.GameSession;
import Main.GameTimer;

public class Laser_test {

	GameTimer gameTimer = new GameTimer();
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
	public void disableEnablelaserOne() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows() - 1; row++) {
			// for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

			if (row == 4) {
				for (int col = 7; col < 12; col++) {

					gameTimer.checkTime(row, col);
					assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
				}
			}
			// }

		}
	}

	@Test
	public void disableEnablelaserTwo() throws InterruptedException {
		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows() - 1; row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (col == 15) {
					// for (row = 2; row < 5; row++) {

					gameTimer.checkTime(row, col);
					assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
				}
				// }
			}

		}
	}

	@Test
	public void disableEnablelaserThree() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows() - 1; row++) {
			// for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

			if (row == 11) {
				for (int col = 14; col < 19; col++) {

					gameTimer.checkTime(row, col);
					assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
				}
			}
			// }

		}
	}

	@Test
	public void disableEnablelaserFour() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (col == 3) {
					// for (row = 12; row < 14; row++) {
					gameTimer.checkTime(row, col);
					assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
					// }
				}
			}

		}
	}

	private void assertTrue(int i, int valueOfPosition) {

	}

}

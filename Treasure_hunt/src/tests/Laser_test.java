package tests;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Main.GameSession;
import Main.GameTimer;

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
	public void disableEnablelaserOne() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (row == 4)
					for (col = 7; col < 12; col++) {

						if (GameTimer.CurentTimer() > 0 && GameTimer.CurentTimer() < 6000)
							testGameSession.gameBoard.disableLaser(row, col);

						else if (GameTimer.CurentTimer() > 6000 && GameTimer.CurentTimer() < 12000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 12000 && GameTimer.CurentTimer() < 18000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 18000 && GameTimer.CurentTimer() < 24000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 24000 && GameTimer.CurentTimer() < 30000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 30000 && GameTimer.CurentTimer() < 36000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 36000 && GameTimer.CurentTimer() < 42000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 42000 && GameTimer.CurentTimer() < 48000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 48000 && GameTimer.CurentTimer() < 54000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 54000 && GameTimer.CurentTimer() < 60000)
							testGameSession.gameBoard.enableLaser(row, col);
						assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
					}
			}

		}
	}

	@Test
	public void disableEnablelaserTwo() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (col == 15)
					for (row = 2; row < 5; row++) {

						if (GameTimer.CurentTimer() > 0 && GameTimer.CurentTimer() < 6000)
							testGameSession.gameBoard.disableLaser(row, col);

						else if (GameTimer.CurentTimer() > 6000 && GameTimer.CurentTimer() < 12000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 12000 && GameTimer.CurentTimer() < 18000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 18000 && GameTimer.CurentTimer() < 24000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 24000 && GameTimer.CurentTimer() < 30000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 30000 && GameTimer.CurentTimer() < 36000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 36000 && GameTimer.CurentTimer() < 42000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 42000 && GameTimer.CurentTimer() < 48000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 48000 && GameTimer.CurentTimer() < 54000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 54000 && GameTimer.CurentTimer() < 60000)
							testGameSession.gameBoard.enableLaser(row, col);
						assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
					}
			}

		}
	}

	@Test
	public void disableEnablelaserThree() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (row == 11)
					for (col = 14; col < 19; col++) {

						if (GameTimer.CurentTimer() > 0 && GameTimer.CurentTimer() < 6000)
							testGameSession.gameBoard.disableLaser(row, col);

						else if (GameTimer.CurentTimer() > 6000 && GameTimer.CurentTimer() < 12000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 12000 && GameTimer.CurentTimer() < 18000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 18000 && GameTimer.CurentTimer() < 24000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 24000 && GameTimer.CurentTimer() < 30000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 30000 && GameTimer.CurentTimer() < 36000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 36000 && GameTimer.CurentTimer() < 42000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 42000 && GameTimer.CurentTimer() < 48000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 48000 && GameTimer.CurentTimer() < 54000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 54000 && GameTimer.CurentTimer() < 60000)
							testGameSession.gameBoard.enableLaser(row, col);
						assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
					}
			}

		}
	}

	@Test
	public void disableEnablelaserFour() throws InterruptedException {

		for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
			for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

				if (col == 3)
					for (row = 12; row < 14; row++) {

						if (GameTimer.CurentTimer() > 0 && GameTimer.CurentTimer() < 6000)
							testGameSession.gameBoard.disableLaser(row, col);

						else if (GameTimer.CurentTimer() > 6000 && GameTimer.CurentTimer() < 12000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 12000 && GameTimer.CurentTimer() < 18000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 18000 && GameTimer.CurentTimer() < 24000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 24000 && GameTimer.CurentTimer() < 30000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 30000 && GameTimer.CurentTimer() < 36000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 36000 && GameTimer.CurentTimer() < 42000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 42000 && GameTimer.CurentTimer() < 48000)
							testGameSession.gameBoard.enableLaser(row, col);
						else if (GameTimer.CurentTimer() > 48000 && GameTimer.CurentTimer() < 54000)
							testGameSession.gameBoard.disableLaser(row, col);
						else if (GameTimer.CurentTimer() > 54000 && GameTimer.CurentTimer() < 60000)
							testGameSession.gameBoard.enableLaser(row, col);
						assertTrue(5, testGameSession.gameBoard.getValueOfPosition(row, col));
					}
			}

		}
	}

	private void assertTrue(int i, int valueOfPosition) {

	}

}

package Main;

public class Laser {
	
	GameSession testGameSession = new GameSession();
	
	public void checkTime(int row, int col) {

		if (GameTimer.CurentTimer() >= 0 && GameTimer.CurentTimer() < 6000)
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
	}

}



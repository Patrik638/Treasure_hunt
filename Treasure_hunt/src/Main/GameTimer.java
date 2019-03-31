package Main;

import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

import static Main.GameBoard.gameBoardGameOver;
import static Main.GameSession.*;
import static java.lang.Thread.sleep;

public class GameTimer {

	GameSession testGameSession = new GameSession();
	static Instant start;

	public static void StartTimer() {

		start = Instant.now();

	}

	public static long CurentTimer() { // THis method can use in Laser and for showing how much is Passed
		Instant TimeTemp = Instant.now();
		long TimeElapsed = Duration.between(start, TimeTemp).toMillis();
		return TimeElapsed;
	}

	public Instant GetStartTime() { // It returing Start It can use for preseting Start time to GUI
		return start;
	}

	public static void GameOverMaxTime() {
		if (CurentTimer() >= 60000) {
			gameBoardGameOver = true;
		}
	}

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

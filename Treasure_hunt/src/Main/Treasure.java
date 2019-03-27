package Main;

public class Treasure {
	
	GameSession testGameSession = new GameSession();

	public void treasureFounded(int row, int col) {
		if (testGameSession.gameBoard.getValueOfPosition(row, col)==3) {
			testGameSession.gameBoard.setValueOfPosition(row, col, 0);
		}
	}
	
	// Om player g�r p� en 3:a ska denna metod anropas
	public int increaseTreasureCounter(int counter) {
		return counter++;
	}
	
	// Kontrollerar om alla skatter har hittats och �ppnar d�rren i s� fall.
	public void allTreasureFound() {
		if (testGameSession.gameBoard.numberOfCurrentTreasureOnBoard() == 0) {
			testGameSession.gameBoard.enableDoor(8, 29);
		}
	}
}

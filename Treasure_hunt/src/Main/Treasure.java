package Main;

public class Treasure {
	
	GameSession testGameSession = new GameSession();
	
	public int numberOfTreasure() {
		int treasuresFounded=0;
		for (int row = 0; row< testGameSession.gameBoard.getNumberOfRows(); row++){
			for(int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++){
				if (testGameSession.gameBoard.getValueOfPosition(row,col)==3){
					treasuresFounded++;
				}
			}
		}
		return treasuresFounded;
	}

	public void treasureFounded(int row, int col) {
		if (testGameSession.gameBoard.getValueOfPosition(row, col)==3) {
			testGameSession.gameBoard.setValueOfPosition(row, col, 0);
		}
	}
	
	// Om player går på en 3:a ska denna metod anropas
	public int increaseTreasureCounter(int counter) {
		return counter++;
	}
	
	// Kontrollerar om alla skatter har hittats och öppnar dörren i så fall.
	public void allTreasureFound() {
		if (numberOfTreasure() == 0) {
			testGameSession.gameBoard.enableDoor(8, 29);
		}
	}
}

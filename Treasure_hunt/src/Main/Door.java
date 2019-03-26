package Main;

public class Door {
	
	GameSession testGameSession = new GameSession();
	
	public boolean isDoorEnabled(int x, int y) {
		
		int doorValue = testGameSession.gameBoard.getValueOfPosition(x, y);
		if (doorValue == 4) {
			return true;
		}
		return false;
	}
	
	public int doorAtBoard(int doorsFound) {
		for (int row = 0; row< testGameSession.gameBoard.getNumberOfRows(); row++){
			for(int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++){
				if (testGameSession.gameBoard.getValueOfPosition(row,col)==2){
					doorsFound++;
				}
			}
		}
		return doorsFound;
	}
}

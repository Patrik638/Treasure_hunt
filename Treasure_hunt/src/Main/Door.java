package Main;

public class Door {
	
	GameBoard gameBoard = new GameBoard();
	
	public boolean isDoorEnabled(int x, int y) {
		
		int doorValue = gameBoard.getValueOfPosition(x, y);
		if (doorValue == 4) {
			return true;
		}
		return false;
	}

	public void disableDoor() {
		
		
	}
}

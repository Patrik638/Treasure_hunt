package Main;

import javax.swing.JTextArea;

public class GameBoard {
	/*
	 * 	1=vägg
		2=spelare
		3=skatt
		4=dörr
		5=laser
	 * 
	 */
	public Player player = new Player();
	int playerRow;
	int playerCol;
	private int[][] gameBoard = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,1,0,0,0,0,0,0,3,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,2,0,0,1,0,0,0,0,0,1,1,1,0,0,5,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,1,3,0,0,0,0,0,0,1,0,0,5,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,1,1,1,5,5,5,5,5,1,0,0,5,0,3,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,4},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,0,0,0,0,0,0,0,0,0,1,5,5,5,5,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,5,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,5,0,1,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,1,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,3,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,3,1,0,1,1,0,0,0,0,1,3,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	
	public GameBoard() {
		
	}


	public void updatePlayerPosition(){
	    playerRow=player.getPlayerRowNumber();
	    playerCol=player.getPlayerColNumber();
    }
	public int[][] getGameBoard() {
		return gameBoard;
	}
	
	public void setGameBoard(int[][] gameBoard) {
		this.gameBoard = gameBoard;
	}

	public int getValueOfPosition(int row, int col) {
		return gameBoard[row][col];
	}

	public int getNumberOfRows(){
		return gameBoard.length;
	}
	public int getNumberOfCols(){
		return gameBoard[0].length;
	}

	public void setValueOfPosition(int row, int col, int intToSet){
		gameBoard[row][col]=intToSet;
	}

	public JTextArea print(JTextArea text) {
		for (int row = 0; row < 19; row++) {
			for (int col = 0; col < 30; col++) {
				text.append(Integer.toString(gameBoard[row][col]));
			}
			text.append("\n");
		}
		return text;
	}

	public int getIntLeftFromPlayer(){
	    updatePlayerPosition();
		return getValueOfPosition(playerRow,playerCol-1);
	}

	public int getIntRightFromPlayer(){
        updatePlayerPosition();
		return getValueOfPosition(playerRow,playerCol+1);
	}

	public int getIntUpFromPlayer(){
        updatePlayerPosition();
		return getValueOfPosition(playerRow-1,playerCol);
	}
	public int getIntDownFromPlayer(){
	    updatePlayerPosition();
		return getValueOfPosition(playerRow+1,playerCol);
	}

	public void playerWantToMoveLeft() {
		if (player.movePlayerLeft(getIntLeftFromPlayer())){
            setValueOfPosition(playerRow,playerCol-1,2);
            //player moved. Setting previous location to 0
            setValueOfPosition(playerRow,playerCol,0);
        }

	}
}

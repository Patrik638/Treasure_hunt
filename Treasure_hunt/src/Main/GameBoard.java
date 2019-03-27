package Main;

import javax.swing.JTextArea;

public class GameBoard {
	/*
	 * 	1=v�gg
		2=spelare
		3=skatt
		4=d�rr
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
			{1,0,0,1,1,0,0,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,4},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,0,1,0,0,0,0,0,0,0,0,0,1,5,5,5,5,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,5,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,5,0,1,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,1,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,3,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,3,1,0,1,1,0,0,0,0,1,3,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

	public boolean gameBoardGameOver =false;
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

	public boolean playerWantToMoveLeft() {
		int targetPos=getIntLeftFromPlayer();
		if (player.movePlayerLeft(targetPos)){
			updatePlayerPosition();
            setValueOfPosition(playerRow,playerCol,2);
            //player moved. Setting previous location to 0
            setValueOfPosition(playerRow,playerCol+1,0);
            setGameBoardGameOverOverIfLaserIsHit(targetPos);
            return true;
        }
		return false;
	}

	public boolean playerWantToMoveRight() {
		int targetPos=getIntRightFromPlayer();
		if (player.movePlayerRight(targetPos)){
			updatePlayerPosition();
			setValueOfPosition(playerRow,playerCol,2);
			//player moved. Setting previous location to 0
			setValueOfPosition(playerRow,playerCol-1,0);
			setGameBoardGameOverOverIfLaserIsHit(targetPos);
			return true;
		}
		return false;
	}

    public boolean playerWantToMoveUp() {
		int newTargetPos=getIntUpFromPlayer();
        if (player.movePlayerUp(newTargetPos)){
            updatePlayerPosition();
            setValueOfPosition(playerRow,playerCol,2);
            //player moved. Setting previous location to 0
            setValueOfPosition(playerRow+1,playerCol,0);
			setGameBoardGameOverOverIfLaserIsHit(newTargetPos);
            return true;
        }
        return false;
    }

    public boolean playerWantToMoveDown() {
		int targetPos=getIntDownFromPlayer();
        if (player.movePlayerDown(getIntDownFromPlayer())){
            updatePlayerPosition();
            setValueOfPosition(playerRow,playerCol,2);
            //player moved. Setting previous location to 0
            setValueOfPosition(playerRow-1,playerCol,0);
			setGameBoardGameOverOverIfLaserIsHit(targetPos);
            return true;
        }
        return false;
    }



	public void setPlayerPosition(int row,int col){
		// Setting old position to 0
		setValueOfPosition(player.getPlayerRowNumber(),player.getPlayerColNumber(),0);
		// Changing location to player

		player.setPlayerPosition(row,col);
		updatePlayerPosition();
		// setting position of player to board
		setValueOfPosition(row,col,2);
	}
	
	// Ej klar
	public int numberOfCurrentTreasureOnBoard() {
		int treasuresFounded=0;
		for (int row = 0; row< gameBoard.length; row++){
			for(int col = 0; col < gameBoard[0].length; col++){
				if (gameBoard[row][col]==3){
					treasuresFounded++;
				}
			}
		}
		return treasuresFounded;
	}
	
	public void disableDoor(int row, int col) {
		setValueOfPosition(row, col, 1);
	}
	
	public void enableDoor(int row, int col) {
		setValueOfPosition(row, col, 4);
	}

	private void setGameBoardGameOverOverIfLaserIsHit(int targetInt){
		if(targetInt==5){
			gameBoardGameOver =true;
		}
	}
}
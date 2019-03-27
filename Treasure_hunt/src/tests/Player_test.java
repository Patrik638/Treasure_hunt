package tests;

import Main.GameSession;
import Main.Player;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Player_test {

	GameSession testGameSession = new GameSession();
	//Player player=new Player();

	@Test
	public void correctPositionOfPlayer() {
		int actualInt;

		actualInt=testGameSession.gameBoard.getValueOfPosition(2,1);
		assertEquals("Expecting 2 to be written on players initial position ",2,actualInt);
	}
	
	@Test
	public void OnePlayerShouldExistAtBoard() {
		int playersFound = 0;
		for (int row = 0; row< testGameSession.gameBoard.getNumberOfRows(); row++){
			for(int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++){
				if (testGameSession.gameBoard.getValueOfPosition(row,col)==2){
					playersFound++;
				}
			}
		}
		assertEquals("Expecting one player to exist",1,playersFound);
	}
	
	@Test
	public void playerMoveLeftDirection_intoOpenSpace() {
		testGameSession.gameBoard.setPlayerPosition(1,3);
		assertEquals("Position to the left of player is open space (0)",0,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoLaser() {
		testGameSession.gameBoard.setPlayerPosition(12,4);
		assertEquals("Position to the left of player is laser area (5)",5,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
		assertEquals("GameOver boolean should be set to true",true,testGameSession.gameBoard.gameBoardGameOver);
	}
	
	@Test
	public void playerMoveLeftDirection_intoTreasure() {
		testGameSession.gameBoard.setPlayerPosition(3,6);
		assertEquals("Position to the left of player is a treasure(3)",3,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoDoor() {
		// First setting a door
		testGameSession.gameBoard.setValueOfPosition(1,0,4);
		//setting playerlocation to right of the door
		testGameSession.gameBoard.setPlayerPosition(1,1);

		assertEquals("Position to the left of player is a door(4)",4,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoWall() {
		assertEquals("Position to the left of player is a wall (1)",1,intLeftOfPlayer());
		assertEquals("Verifying player is not allowed to move to the left",false,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should remain on initial position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveRightDirection_intoOpenSpace() {
		testGameSession.gameBoard.setPlayerPosition(2,1);
		assertEquals("Position to the right of player is open space (0)",0,intRightOfPlayer());
		assertEquals("Verifying player is allowed to move to the right",true,testGameSession.gameBoard.playerWantToMoveRight());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveRightDirection_intoLaser() {
		testGameSession.gameBoard.setPlayerPosition(2,14);
		assertEquals("Position to the right of player is laser (5)",5,intRightOfPlayer());
		assertEquals("Verifying player is allowed to move to the right",true,testGameSession.gameBoard.playerWantToMoveRight());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
		assertEquals("GameOver boolean should be set to true",true,testGameSession.gameBoard.gameBoardGameOver);
	}
	
	@Test
	public void playerMoveRightDirection_intoTreasure() {
		testGameSession.gameBoard.setPlayerPosition(1,10);
		assertEquals("Position to the right of player is a treasure(3)",3,intRightOfPlayer());
		assertEquals("Verifying player is allowed to move to the right",true,testGameSession.gameBoard.playerWantToMoveRight());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveRightDirection_intoDoor() {
		// First setting a door
		testGameSession.gameBoard.setValueOfPosition(3,29,4);
		//setting playerlocation to right of the door
		testGameSession.gameBoard.setPlayerPosition(3,28);

		assertEquals("Position to the right of player is a door(4)",4,intRightOfPlayer());
		assertEquals("Verifying player is allowed to move to the right",true,testGameSession.gameBoard.playerWantToMoveRight());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());

	}
	
	@Test
	public void playerMoveRightDirection_intoWall() {
		testGameSession.gameBoard.setPlayerPosition(3,28);
		assertEquals("Position to the right of player is a wall (1)",1,intRightOfPlayer());
		assertEquals("Verifying player is not allowed to move to the right",false,testGameSession.gameBoard.playerWantToMoveRight());
		assertEquals("Player should remain on initial position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveUpDirection_intoOpenSpace() {
		testGameSession.gameBoard.setPlayerPosition(2,1);
		assertEquals("Position above player is open space (0)",0,intAbovePlayer());
		assertEquals("Verifying player is allowed to move up",true,testGameSession.gameBoard.playerWantToMoveUp());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveUpDirection_intoLaser() {
		testGameSession.gameBoard.setPlayerPosition(5,10);
		assertEquals("Position above player is Laser (5)",5,intAbovePlayer());
		assertEquals("Verifying player is allowed to move up",true,testGameSession.gameBoard.playerWantToMoveUp());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
		assertEquals("GameOver boolean should be set to true",true,testGameSession.gameBoard.gameBoardGameOver);
	}
	
	@Test
	public void playerMoveUpDirection_intoTreasure() {
		testGameSession.gameBoard.setPlayerPosition(5,17);
		assertEquals("Position above player is a treasure (3)",3,intAbovePlayer());
		assertEquals("Verifying player is allowed to move up",true,testGameSession.gameBoard.playerWantToMoveUp());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveUpDirection_intoDoor() {
		// First setting a door
		testGameSession.gameBoard.setValueOfPosition(0,10,4);
		//setting playerlocation to right of the door
		testGameSession.gameBoard.setPlayerPosition(1,10);

		assertEquals("Position above player is a door (4)",4,intAbovePlayer());
		assertEquals("Verifying player is allowed to move up",true,testGameSession.gameBoard.playerWantToMoveUp());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());

	}
	
	@Test
	public void playerMoveUpDirection_intoWall() {
		testGameSession.gameBoard.setPlayerPosition(1,1);
		assertEquals("Position above player is a wall (1)",1,intAbovePlayer());
		assertEquals("Verifying player is not allowed to move up",false,testGameSession.gameBoard.playerWantToMoveUp());
		assertEquals("Player should display on same position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveDownDirection_intoOpenSpace() {
		testGameSession.gameBoard.setPlayerPosition(2,1);
		assertEquals("Position below player is open space (0)",0,intBelowPlayer());
		assertEquals("Verifying player is allowed to move down",true,testGameSession.gameBoard.playerWantToMoveDown());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());

	}
	
	@Test
	public void playerMoveDownDirection_intoLaser() {
		testGameSession.gameBoard.setPlayerPosition(3,7);
		assertEquals("Position below player is a laser(5)",5,intBelowPlayer());
		assertEquals("Verifying player is allowed to move down",true,testGameSession.gameBoard.playerWantToMoveDown());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
		assertEquals("GameOver boolean should be set to true",true,testGameSession.gameBoard.gameBoardGameOver);
	}
	
	@Test
	public void playerMoveDownDirection_intoTreasure() {
		testGameSession.gameBoard.setPlayerPosition(2,5);
		assertEquals("Position below player is a treasure (3)",3,intBelowPlayer());
		assertEquals("Verifying player is allowed to move down",true,testGameSession.gameBoard.playerWantToMoveDown());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveDownDirection_intoDoor() {
		// First setting a door
		testGameSession.gameBoard.setValueOfPosition(18,1,4);
		//setting playerlocation to right of the door
		testGameSession.gameBoard.setPlayerPosition(17,1);

		assertEquals("Position below player is a door (4)",4,intBelowPlayer());
		assertEquals("Verifying player is allowed to move down",true,testGameSession.gameBoard.playerWantToMoveDown());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());

	}
	
	@Test
	public void playerMoveDownDirection_intoWall() {
		//setting playerlocation to right of the door
		testGameSession.gameBoard.setPlayerPosition(17,1);

		assertEquals("Position below player is a wall (1)",1,intBelowPlayer());
		assertEquals("Verifying player is not allowed to move down",false,testGameSession.gameBoard.playerWantToMoveDown());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());

	}

	private int intLeftOfPlayer(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber();
		int col=testGameSession.gameBoard.player.getPlayerColNumber()-1;
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}

	private int intRightOfPlayer(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber();
		int col=testGameSession.gameBoard.player.getPlayerColNumber()+1;
		int returnInt=testGameSession.gameBoard.getValueOfPosition(row,col);
		return returnInt;
	}

	private int intAbovePlayer(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber()-1;
		int col=testGameSession.gameBoard.player.getPlayerColNumber();
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}

	private int intBelowPlayer(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber()+1;
		int col=testGameSession.gameBoard.player.getPlayerColNumber();
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}


	private int charAtExpectedPlayerLocation(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber();
		int col=testGameSession.gameBoard.player.getPlayerColNumber();
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}

}

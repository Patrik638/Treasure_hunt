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
		//TODO:Set player location so open space exists to the left
		testGameSession.gameBoard.setPlayerPosition(1,3);
		assertEquals("Position to the left of player is open space (0)",0,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoLaser() {

		//TODO:Set player location so a laser exists to the left

		assertEquals("Position to the left of player is laser area (5)",5,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.player.movePlayerLeft(intLeftOfPlayer()));
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoTreasure() {
		//TODO:Set player location so a treasure exists to the left
		assertEquals("Position to the left of player is a treasure(3)",3,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.player.movePlayerLeft(intLeftOfPlayer()));
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoDoor() {
		//TODO:Set player location so a door exists to the left
		assertEquals("Position to the left of player is a door(4)",4,intLeftOfPlayer());
		assertEquals("Verifying player is allowed to move to the left",true,testGameSession.gameBoard.player.movePlayerLeft(intLeftOfPlayer()));
		assertEquals("Player should display on new position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveLeftDirection_intoWall() {
		assertEquals("Position to the left of player is a wall (1)",1,intLeftOfPlayer());
		assertEquals("Verifying player is not allowed to move to the left",false,testGameSession.gameBoard.playerWantToMoveLeft());
		assertEquals("Player should remain on initial position",2,charAtExpectedPlayerLocation());
	}
	
	@Test
	public void playerMoveRightDirection() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveRightDirection_intoLaser() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveRightDirection_intoTreasure() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveRightDirection_intoDoor() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveRightDirection_intoWall() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveUpDirection() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveUpDirection_intoLaser() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveUpDirection_intoTreasure() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveUpDirection_intoDoor() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveUpDirection_intoWall() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveDownDirection() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveDownDirection_intoLaser() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveDownDirection_intoTreasure() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveDownDirection_intoDoor() {
		assertEquals(false,true);
	}
	
	@Test
	public void playerMoveDownDirection_intoWall() {
		assertEquals(false,true);
	}

	private int intLeftOfPlayer(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber();
		int col=testGameSession.gameBoard.player.getPlayerColNumber()-1;
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}
	private int charAtExpectedPlayerLocation(){
		int row=testGameSession.gameBoard.player.getPlayerRowNumber();
		int col=testGameSession.gameBoard.player.getPlayerColNumber();
		return testGameSession.gameBoard.getValueOfPosition(row,col);
	}

}

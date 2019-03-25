package tests;

import Main.GameSession;
import Main.Player;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Player_test {

	GameSession testGameSession = new GameSession();


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
	public void playerMoveLeftDirection() {
		//
	}
	
	@Test
	public void playerMoveLeftDirection_intoLaser() {
		
	}
	
	@Test
	public void playerMoveLeftDirection_intoTreasure() {
		
	}
	
	@Test
	public void playerMoveLeftDirection_intoDoor() {
		
	}
	
	@Test
	public void playerMoveLeftDirection_intoWall() {
		Player player=new Player();
				// Verifying ieft position of player is a wall
        int potentialTargetPositionContains=testGameSession.gameBoard.getValueOfPosition(player.getPlayerRowNumber(),player.getPlayerColNumber()-1);

		assertEquals("Position to the left of player is a wall (1)",1,testGameSession.gameBoard.getValueOfPosition(player.getPlayerRowNumber(),player.getPlayerColNumber()-1));
		assertEquals("Verifying player is not allowed to move to the left",false,player.movePlayerLeft(potentialTargetPositionContains));
		assertEquals("Player should remain on initial position",2,testGameSession.gameBoard.getValueOfPosition(player.getPlayerRowNumber(),player.getPlayerColNumber()));
	}
	
	@Test
	public void playerMoveRightDirection() {
		
	}
	
	@Test
	public void playerMoveRightDirection_intoLaser() {
		
	}
	
	@Test
	public void playerMoveRightDirection_intoTreasure() {
		
	}
	
	@Test
	public void playerMoveRightDirection_intoDoor() {
		
	}
	
	@Test
	public void playerMoveRightDirection_intoWall() {
		
	}
	
	@Test
	public void playerMoveUpDirection() {
		
	}
	
	@Test
	public void playerMoveUpDirection_intoLaser() {
		
	}
	
	@Test
	public void playerMoveUpDirection_intoTreasure() {
		
	}
	
	@Test
	public void playerMoveUpDirection_intoDoor() {
		
	}
	
	@Test
	public void playerMoveUpDirection_intoWall() {
		
	}
	
	@Test
	public void playerMoveDownDirection() {
		
	}
	
	@Test
	public void playerMoveDownDirection_intoLaser() {
		
	}
	
	@Test
	public void playerMoveDownDirection_intoTreasure() {
		
	}
	
	@Test
	public void playerMoveDownDirection_intoDoor() {
		
	}
	
	@Test
	public void playerMoveDownDirection_intoWall() {
		
	}
	
}

package tests;

import java.text.ParseException;

import Main.GameSession;
import Main.GameTimer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

public class Timer_test {

	@Test
	public void isTimeoutTrue() throws InterruptedException {
		GameSession testGameSession = new GameSession();
		GameTimer testGameTimer= new GameTimer();
		testGameTimer.Timer();
		assertEquals(true, testGameSession.GetTimout());
	}

	@Test
	public void isTimeoutFalse() throws InterruptedException {
		GameSession testGameSession = new GameSession();
		GameTimer testGameTimer= new GameTimer();
		testGameTimer.Timer();
		assertEquals(false, !testGameSession.GetTimout());
	}

	@Test
	public void TimeIsMaxValue() throws InterruptedException {
		GameSession testGameSession = new GameSession();
		GameTimer testGameTimer= new GameTimer();
		float Actual =testGameTimer.Timer();
		float ExpectedS=60;
		assertEquals(ExpectedS,Actual,0);

	}

	@Test
	public void LaserTimeTest() throws InterruptedException {
		GameSession testGameSession = new GameSession();
		GameTimer testGameTimer= new GameTimer();
		float Actual =testGameTimer.LaserTimer();
		float ExpectedS=6;
		assertEquals(ExpectedS,Actual,0);
	}

};

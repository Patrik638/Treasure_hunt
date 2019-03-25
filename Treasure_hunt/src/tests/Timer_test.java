package tests;

import Main.GameTimer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Timer_test {

	@Test
	public void isTimeoutFalseAfterRunningTimer() {

		GameTimer gametimer = new GameTimer();
		gametimer.start();
		boolean actualResult = gametimer.GetTimeFlag();
		assertFalse(actualResult);
	}

	@Test
	public void isTimeoutFalse() {
		GameTimer gametimer = new GameTimer();
		boolean actualResult = gametimer.GetTimeFlag();
		assertFalse(actualResult);

	}
	//


}

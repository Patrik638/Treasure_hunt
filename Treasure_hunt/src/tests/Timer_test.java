package tests;

import java.text.ParseException;
import java.time.Instant;

import Main.GameSession;
import Main.GameTimer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

public class Timer_test {


    @Test
    public void IsitTimecurenttime(){
        GameTimer TestTimer=new GameTimer();
        Instant Whattimeisnow= Instant.now();
        TestTimer.StartTimer();
        assertEquals(Whattimeisnow,TestTimer.GetStartTime());
    }
    @Test
    public void IsItTImerGiveRightPassedTime() throws InterruptedException {
        GameTimer TestTimer=new GameTimer();
        TestTimer.StartTimer();
        Thread.sleep(40);
        long ActualTimePassed=41;//It should be Pluse one Due to This line take one milisecound to complie

        assertEquals(ActualTimePassed,TestTimer.CurentTimer());

    }

};

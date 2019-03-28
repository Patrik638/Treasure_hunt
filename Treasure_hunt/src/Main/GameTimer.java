package Main;

import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

import static Main.GameSession.*;
import static java.lang.Thread.sleep;

public class GameTimer {
    Instant  start ;
    public void StartTimer(){

        start = Instant.now();

    }
    public long CurentTimer(){ //THis method can use in Laser and for showing how much is Passed
        Instant TimeTemp= Instant.now();
        long TimeElapsed= Duration.between(start, TimeTemp).toMillis();
        return TimeElapsed;
    }
    public Instant GetStartTime(){ // It returing Start It can use for preseting Start time to GUI
        return start;
    }

}



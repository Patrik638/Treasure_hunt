package Main;
import java.util.Timer;
import java.util.TimerTask;

import static Main.GameSession.*;
import static java.lang.Thread.sleep;

public class GameTimer {


    public float  Timer() throws InterruptedException {
        long start = System.currentTimeMillis();
            //set timer for a minute
            for (int i = 0; i <1000; i++){
                if(!GameSession.GetTimout())
                //one secunds
                sleep(60);}
            	GameSession.SetTimeout();
                //How much time is passed
                long end = System.currentTimeMillis();
                float sec = (end - start) / 1000;
              // System.out.println(sec + " seconds");
        return sec;


    }
    public float LaserTimer() throws InterruptedException {
        long start = System.currentTimeMillis();
        //Set tierm for 6 secunds
        for (int i = 0; i <100; i++) {
            //one secunds
            sleep(60);
        }
            //How much time is passed
            long end = System.currentTimeMillis();

            float sec = (end - start) / 1000;
         // System.out.println(sec + " seconds");
        return sec;
    }

  /* public static void main(String[] args) throws Exception{
        GameTimer gametimertest = new GameTimer();
        gametimertest.LaserTimer();
        gametimertest.Timer();


    }*/
}



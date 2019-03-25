package Main;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    static boolean  TimeFlag=false;
    int counter=20; // Max counter time
    static int TimeisPassed=0;


    Timer timer=new Timer();

    TimerTask task= new TimerTask() {
        public void run() {
            TimeFlag=true;
            if(TimeisPassed<counter&&TimeFlag) {
                //do someting or check something

                TimeisPassed++;
                System.out.println("Secounds Passed:"+TimeisPassed);
            }
            else {
                System.out.println("Time is Over");
                TimeFlag=false;
                timer.cancel();// Timer Cancel
                GetTimeFlag ();
                GetTimePassed();
            }

        }

    };

    public boolean GetTimeFlag (){
        return TimeFlag;

    }


    public void start() {
        timer.scheduleAtFixedRate(task, 1000, 1000);
        GetTimeFlag();
    }
    public int GetTimePassed() {
        return TimeisPassed;
    }

// You can uncomment for testing the Timer
   /* public static void main(String[] args) {
        GameTimer gametimertest = new GameTimer();
        gametimertest.start();

    }
    */
}

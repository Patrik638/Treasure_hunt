package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Timer;

import org.junit.Test;

import Main.GameSession;
import Main.Laser;

public class Laser_test {

    GameSession testGameSession = new GameSession();
//	Timer timer = new Timer();

    @Test
    public void LasersExistsAtBoard() {
        Laser laser = new Laser();
        int lasersFound = 0;
        for (int row = 0; row < testGameSession.gameBoard.getNumberOfRows(); row++) {
            for (int col = 0; col < testGameSession.gameBoard.getNumberOfCols(); col++) {

                while (row == 4) {
                    if (col == 7)
                        lasersFound++;
                    else if (col == 8)
                        lasersFound++;
                    else if (col == 9)
                        lasersFound++;
                    else if (col == 10)
                        lasersFound++;
                    else if (col == 11)
                        lasersFound++;
                }
            }
        }

        assertEquals("Finding a laser", 1, lasersFound);
        assertFalse(laser.isLaserEnabled());

    }

    // Checking laser from row = 4 to column = (7 - 11)
    @Test
    public void laser1Enabled() {

        Laser laser = new Laser();

        int row = 4;
        for (int col = 7; col < 12; col++) {
            assertTrue(laser.isLaserEnabled(row, col));
        }

    }

    // tester ska g�ras f�r alla fyra lasers
//		@Test
//		public void laser1Disabled() {
    // instansieringg av test game session med timer satt till tex 7 sec d�r laser 1
    // �r disablad
    // verifiera a66 laseer1enabled booleanen �r false
    // verifiera att den inte visas

//		}

}

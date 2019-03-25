package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Timer;

import org.junit.Test;

import Main.GameSession;
import Main.Laser;

public class Laser_test {

	GameSession testGameSession = new GameSession();
//	Timer timer = new Timer();

	// tester ska g�ras f�r alla fyra lasers
//	@Test
//	public void laser1Disabled() {
	// instansieringg av test game session med timer satt till tex 7 sec d�r laser 1
	// �r disablad
	// verifiera a66 laseer1enabled booleanen �r false
	// verifiera att den inte visas

//	}

	//Checking laser from row = 4 to column = (7 - 11)
	@Test
	public void laser1Enabled() {

		Laser laser = new Laser();
		
		int row = 4;
		for (int col = 7; col < 12; col++) {
			assertTrue(laser.isLaserEnabled(row, col));
		}

	}

}

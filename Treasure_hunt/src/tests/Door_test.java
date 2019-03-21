package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Main.Door;

public class Door_test {
	
	@Test
	public void onlyOneDoorAtBoard() {
		
	}
	
	@Test
	public void doorDisabled() {
		Door door = new Door();
		door.disableDoor();
		assertFalse(door.isDoorEnabled(8, 21));
	}
	
	@Test
	public void doorEnabled() {
		Door door = new Door();
		assertTrue(door.isDoorEnabled(8, 21));
	}
}

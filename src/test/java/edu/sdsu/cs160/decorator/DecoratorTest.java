package edu.sdsu.cs160.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {
	@Test
	public void simpleUser() {
		AmazonUser user = new SimpleUser();
		assertEquals("HMac", user.userName());
		assertFalse(user.userAccess().contains("Prime"));
	}
	
	@Test
	public void primeUser() {
		AmazonUser user = new PrimeUser(new SimpleUser());
		assertEquals("Prime user - HMac", user.userName());
		assertTrue(user.userAccess().contains("Prime"));
	}

}

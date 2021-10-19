package edu.sdsu.cs160.assignment.counter;

public class PetCounter {
	private static PetCounter petCounter;
	
	private PetCounter() {
		
	}
	
	public static PetCounter getInstance() {
		petCounter =  new PetCounter();
		return petCounter;
	}
	
	private int count;
	
	public void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

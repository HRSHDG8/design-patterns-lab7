package edu.sdsu.cs160.assignment.pet;

public class Dog implements Pet{
	@Override
	public String sound() {
		return "Bow wow";
	}

	@Override
	public String type() {
		return "Dog";
	}

}

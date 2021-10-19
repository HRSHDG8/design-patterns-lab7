package edu.sdsu.cs160.assignment.pet;

public class Cat implements Pet{
	@Override
	public String sound() {
		return "Meowww";
	}

	@Override
	public String type() {
		return "Cat";
	}

}

package edu.sdsu.cs160.assignment.pet.premium;

import edu.sdsu.cs160.assignment.pet.Pet;

public class PremiumPet implements Pet {
	private Pet pet;
	
	public PremiumPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String sound() {
		return null;
	}

	@Override
	public String type() {
		return null;
	}
	
}

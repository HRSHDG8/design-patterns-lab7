package edu.sdsu.cs160.assignment.spa;

import edu.sdsu.cs160.assignment.pet.Pet;

public class PetSpaTemplate implements SpaTemplate {
	
	private Pet pet;
	
	public PetSpaTemplate(Pet pet) {
		this.pet = pet;
	}

	@Override
	public void wash() {
		System.out.println("Washing your pet");		
	}

	@Override
	public void shampoo() {
		System.out.println("Cleaning your pet");
	}

	@Override
	public void dry() {
		System.out.println("Drying your pet, it says " + pet.sound());		
	}

}

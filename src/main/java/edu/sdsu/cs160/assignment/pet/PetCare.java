package edu.sdsu.cs160.assignment.pet;

import java.util.ArrayList;
import java.util.List;

import edu.sdsu.cs160.assignment.counter.PetCounter;

public class PetCare {
	private final List<Pet> pets;
	
	public PetCare() {
		this.pets = new ArrayList<>();
	}
	
	public void addPet(Pet pet) {
		PetCounter.getInstance().increment();
		this.pets.add(pet);
	}
	
	public List<Pet> getPets(){
		return this.pets;
	}

}

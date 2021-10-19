package edu.sdsu.cs160;

import edu.sdsu.cs160.assignment.counter.PetCounter;
import edu.sdsu.cs160.assignment.notification.Observer;
import edu.sdsu.cs160.assignment.notification.PetObserver;
import edu.sdsu.cs160.assignment.notification.PetSubject;
import edu.sdsu.cs160.assignment.pet.Cat;
import edu.sdsu.cs160.assignment.pet.Dog;
import edu.sdsu.cs160.assignment.pet.PetCare;
import edu.sdsu.cs160.assignment.pet.premium.PremiumPet;

public class Main {
	public static void main(String[] args) {
		PetCare myShop = new PetCare();
		myShop.addPet(new Dog());
		myShop.addPet(new Cat());
		myShop.addPet(new Dog());
		myShop.addPet(new Dog());
		myShop.addPet(new Cat());
		myShop.addPet(new Dog());
		// TODO fix pet counter to correctly implement singleton pattern
		// get this count to correct value i.e. 6
		System.out.println("Total pets in my shop "+ PetCounter.getInstance().getCount());
		
		// TODO fix sendPet to correctly implement template pattern
		// make sure to add all patterns from the template
		myShop.getPets().forEach(pet->pet.sendPetForSpa());
		
		//TODO implement all methods of decorator Premium pet such that it returns "Premium "+ base behaviour
		
		myShop.addPet(new PremiumPet(new Cat()));
		myShop.addPet(new PremiumPet(new Dog()));
		myShop.getPets().forEach(pet->System.out.println(pet.sound()));
		
		//OBSERVER
		
		PetSubject awesomePet = new PetSubject(new Dog());
		Observer petObs = new PetObserver(awesomePet);
		awesomePet.setPet(new Cat());
		awesomePet.setPet(new Cat());
		awesomePet.setPet(new Dog());
		// Notice what happens when you pass a premium pet
		awesomePet.setPet(new PremiumPet(new Dog()));
		
	}
}

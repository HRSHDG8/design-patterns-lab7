package edu.sdsu.cs160.assignment.notification;

import java.util.ArrayList;
import java.util.List;

import edu.sdsu.cs160.assignment.pet.Pet;

public class PetSubject {
	private Pet pet;
	private List<Observer> observers;
	public PetSubject(Pet pet) {
		this.pet = pet;
		this.observers = new ArrayList<>();
	}

	   public Pet getPet() {
	      return pet;
	   }

	   public void setPet(Pet pet) {
	      this.pet = pet;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 	
}

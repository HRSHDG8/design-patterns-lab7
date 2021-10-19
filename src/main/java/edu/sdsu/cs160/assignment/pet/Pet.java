package edu.sdsu.cs160.assignment.pet;

import edu.sdsu.cs160.assignment.spa.PetSpaTemplate;
import edu.sdsu.cs160.assignment.spa.SpaTemplate;

public interface Pet {
	String sound();
	String type();
	
	default void sendPetForSpa() {
		SpaTemplate spaTemplate = new PetSpaTemplate(this);
		// TODO add the steps for a pet spa below
		
	}
}

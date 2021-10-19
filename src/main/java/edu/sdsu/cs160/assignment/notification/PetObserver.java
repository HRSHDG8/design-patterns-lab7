package edu.sdsu.cs160.assignment.notification;

public class PetObserver extends Observer{
	
	public PetObserver(PetSubject petSubject) {
		this.subject = petSubject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Pet has been changed, new Pet is "+ subject.getPet().type());
	}

}

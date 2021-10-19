package edu.sdsu.cs160.assignment.notification;

public abstract class Observer {
	protected PetSubject subject;
	public abstract void update();
}

package edu.sdsu.cs160.decorator;

import java.util.List;

public abstract class UserDecorator implements AmazonUser {
	protected AmazonUser user;
	
	public UserDecorator(AmazonUser user) {
		this.user= user;
	}
	
	@Override
	public String userName() {
		return user.userName();
	}

	@Override
	public List<String> userAccess() {
		return user.userAccess();
	}
}

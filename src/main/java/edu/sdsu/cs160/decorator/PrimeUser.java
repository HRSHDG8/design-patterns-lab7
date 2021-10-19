package edu.sdsu.cs160.decorator;

import java.util.ArrayList;
import java.util.List;

public class PrimeUser extends UserDecorator{

	public PrimeUser(AmazonUser user) {
		super(user);
	}

	@Override
	public String userName() {
		return "Prime user - "+user.userName();
	}

	@Override
	public List<String> userAccess() {
		List<String> access = new ArrayList<>(user.userAccess());
		access.add("Prime");
		return access;
	}

}

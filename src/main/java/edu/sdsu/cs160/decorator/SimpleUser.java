package edu.sdsu.cs160.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleUser implements AmazonUser{

	@Override
	public String userName() {
		return "HMac";
	}

	@Override
	public List<String> userAccess() {
		return new ArrayList<>(Arrays.asList("View","Search","Buy"));
	}

}

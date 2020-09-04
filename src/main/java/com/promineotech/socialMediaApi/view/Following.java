package com.promineotech.socialMediaApi.view;

import com.promineotech.socialMediaApi.entity.User;

import java.util.Set;

public class Following {

	private Set<User> following;
	
	public Following(User user) {
		following = user.getFollowing();
	}
	
	public Set<User> getFollowing() {
		return following;
	}
	
	public void setFollowing(Set<User> following) {
		this.following = following;
	}
}
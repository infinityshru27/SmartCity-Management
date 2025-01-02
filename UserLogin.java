package com.userlogin;

public interface UserLogin {
	boolean login(String username,String password);
	void register(String username,String password,String name);
	void logout();

}

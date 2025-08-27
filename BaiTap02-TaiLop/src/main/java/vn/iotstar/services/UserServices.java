package vn.iotstar.services;

import vn.iotstar.model.UserModel;

public interface UserServices {
	UserModel login(String username, String password);
	UserModel get(String username);
}

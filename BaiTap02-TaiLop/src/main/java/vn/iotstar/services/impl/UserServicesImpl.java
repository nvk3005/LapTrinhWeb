package vn.iotstar.services.impl;

import vn.iotstar.dao.impl.UserDaoImpl;

import vn.iotstar.model.UserModel;
import vn.iotstar.services.UserServices;
import vn.iotstar.dao.UserDao;

public class UserServicesImpl implements UserServices{
	
	UserDao userDao = new UserDaoImpl();
	public UserModel login(String username, String password) {
		UserModel user = this.get(username);
		if(user != null && password.equals(user.getPassWord()))
			return user;
		return null;
	}
	@Override
	public UserModel get(String username) {
		return userDao.get(username);	
	}
}

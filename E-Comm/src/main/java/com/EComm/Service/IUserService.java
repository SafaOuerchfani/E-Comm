package com.EComm.Service;




import java.util.List;

import com.EComm.entities.User;

public interface IUserService {

	User saveUser(User user);

	List<User> findAllUsers();


}

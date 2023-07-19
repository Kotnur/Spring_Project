package com.fos.service;

import com.fos.entity.User;
import com.fos.model.UserDTO;

public interface UserService {
	

		 UserDTO createUser(final User user);
		    
		    UserDTO UserlogIn(final int userId);
		   
		    
		    UserDTO updateuserById(final int userId, final User user);
		    
		    void deleteuserById(final int userId);
		    
		    void deleteAllUsers();
		    
		    public int getUserId();

		    public void setUserId(int userId) ;


	}




package com.fos.serviceimple;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.fos.entity.User;
import com.fos.exceptions.UserNotFoundException;
import com.fos.model.UserDTO;
import com.fos.repository.UserRepository;
import com.fos.service.UserService;

public abstract class UserServiceImple implements UserService{
	
	
	@Autowired
	UserRepository userRepository;
	
	 public UserDTO createUser(UserDTO userDTO) {
	        User user = new User();
	        user.setUserName(userDTO.getUsername());
	        user.setPassword(userDTO.getPassword());

	        User savedUser = userRepository.save(user);
	        return convertToUserDTO(savedUser);
	    }

	    public UserDTO UserlogIn(int userId) {
	        User user = userRepository.findById((long) userId)
	                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));

	        return convertToUserDTO(user);
	    }

	    public void deleteUser(int userId) {
	        User user = userRepository.findById((long) userId)
	                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));

	        userRepository.delete(user);
	    }
	    
	    public UserDTO convertToUserDTO(final User user) {
	        final UserDTO uDto = new UserDTO();
	        if (user != null) {
	            BeanUtils.copyProperties((Object)user, (Object)uDto);
	        }
	        return uDto;
	    }
	    
	    public User convertToUserEntity(final UserDTO uDto) {
	        final User user = new User();
	        if (uDto != null) {
	            BeanUtils.copyProperties((Object)uDto, (Object)user);
	        }
	        return user;
	    }
	
}

package com.fos.util;

import org.springframework.beans.BeanUtils;

import com.fos.entity.User;
import com.fos.model.UserDTO;


public class UserConverter {
	
	//convert User entity into userDTO
    public UserDTO convertToEmpDTO(final User user) {
        final UserDTO uDto = new UserDTO();
        if (user != null) {
            BeanUtils.copyProperties((Object)user, (Object)uDto);
        }
        return uDto;
    }
    
    public User convertTouserEntity(final UserDTO uDto) {
        final User user = new User();
        if (uDto != null) {
            BeanUtils.copyProperties((Object)uDto, (Object)user);
        }
        return user;
    }

}

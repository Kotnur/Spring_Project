package com.fos.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.model.EmployeeDTO;
import com.fos.entity.User;
import com.fos.model.UserDTO;
import com.fos.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	 public UserController(UserService userService) {
	        this.userService = userService;
	    }
	 @PostMapping
	    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
	        // Map UserDTO to User entity
	        User user = mapUserDTOToEntity(userDTO);
	        
	        // Call the service method to create the user
	        User createdUser = userService.createUser(user);
	        
	        // Map the createdUser entity back to UserDTO
	        UserDTO createdUserDTO = mapEntityToUserDTO(createdUser);
	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserDTO);
	    }
	 
	 @GetMapping("/{userId}")
	    public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId) {
	        // Call the service method to retrieve the user
	        User user = userService.getUserById(userId);
	        
	        // Map the user entity to UserDTO
	        UserDTO userDTO = mapEntityToUserDTO(user);
	        
	        if (userDTO != null) {
	            return ResponseEntity.ok(userDTO);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	// Helper methods for mapping between UserDTO and User entities
	 
}

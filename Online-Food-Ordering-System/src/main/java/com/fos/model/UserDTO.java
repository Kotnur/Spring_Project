package com.fos.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
	
	private int userId;
    private String username;
    private String password1;
    private String email;
    private String PhoneNo;
    private String Address;
    
    @NotNull(message ="Username cannot be null")
	@NotBlank(message="Username is required")
	@Size(max= 20, message="Maximum 20 characters allowed")
	@Size(min=2, message= "Minimum 2 values required")
	private String userName;
	
	@NotNull(message="Password cannot be null")
	@NotBlank(message="Password is required")
	@Size(max=20, message="Maximum 20 characters allowed")
	@Size(min=4, message="Minimum 4 values required")
	
    public int getUserId() {
        return userId;
    }
	@NotNull(message = "Username cannot be null")
    public String getUsername() {
        return this. username;
    }
	
	 @NotNull(message = "Password cannot be null")
    public String getPassword() {
        return this. password1;
    }
    public String getEmail() {
        return this. email;
    }
    public String getPhoneNumber() {
        return this. PhoneNo;
    }
    public String getAddress() {
        return this. Address;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setUsername(@NotNull(message = "Username cannot be null") String username) {
        this.username = username;
    }
    
    public void setPassword(@NotNull(message = "Password cannot be null") String password) {
        this.password1 = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNo = phoneNumber;
    }
    public void setAddress(String address) {
        this.Address = address;
    }

}

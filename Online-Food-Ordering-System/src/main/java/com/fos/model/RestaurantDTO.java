package com.fos.model;

public class RestaurantDTO {
	
	private Long restaurantId;
    private String name;
    private String description;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Long getRestaurantId() {
        return restaurantId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

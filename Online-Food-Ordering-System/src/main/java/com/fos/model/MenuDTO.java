package com.fos.model;

public class MenuDTO {

	private Long menuId;
    private String name;
    private String description;
    private int availableQuantity;
    private String menuItem;
    private double price;
    private long restaurantId;
   
    public Long getMenuId() {
        return menuId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public long getRestaurant() {
        return restaurantId;
    }
    public int getavailableQuantity() {
    	return availableQuantity;
    }
    
    public String menuItem() {
    	return menuItem;
    	
    }
    public void setmenuItem(String menuItem) {
    	this.menuItem= menuItem;
    }
    
    public void setavailableQuanity( int availableQuantity) {
    	this.availableQuantity = availableQuantity;
    }
    
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setRestaurant(long restaurantId) {
        this.restaurantId = restaurantId;
    }
}

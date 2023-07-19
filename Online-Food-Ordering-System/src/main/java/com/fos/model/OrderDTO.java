package com.fos.model;

import java.awt.Menu;
import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {

	private Long orderId;
    private LocalDateTime orderDateTime;
    private int quantity;
    private List<Menu> menus;
    
    public Long getOrderId() {
        return orderId;
    }
    
    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
   
    public List<Menu> getMenus() {
        return menus;
    }

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

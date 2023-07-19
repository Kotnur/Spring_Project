package com.fos.service;

import org.springframework.stereotype.Service;

import com.fos.model.OrderDTO;

@Service
public interface OrderService {
	
	OrderDTO placeOrder(int UserId, Long menuId, String menuItem,int quantity);
    OrderDTO getOrderById(int UserId, String menuItem, int quantity);
    public int getUserId();
    public void setUserId(int userId) ;
	void setQuantity(int quantity);
	void setMenuItem(String menuItem);
	void deleteOrder(int UserId, Long menuId, String menuItem, int quantity);


}

package com.fos.serviceimple;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fos.entity.Order;
import com.fos.exceptions.OrderNotFoundException;
import com.fos.model.OrderDTO;
import com.fos.model.UserDTO;
import com.fos.repository.OrderRepository;
import com.fos.service.OrderService;


public class OrderServiceImple implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	 @Override
	    public OrderDTO placeOrder(Long UserId, Long menuId, String menuItem, int quantity) {
	        // Perform any necessary business logic/validation
	        
	        // Create an Order entity and set the necessary fields
	        Order order = new Order();
	        ((OrderService) order).setUserId(UserId);
	        ((OrderService) order).setMenuItem(menuItem);
	        ((OrderService) order).setQuantity(quantity);
	        
	        // Save the order using the repository
	        Order savedOrder = orderRepository.save(order);
	        
	        // Map the savedOrder entity to an OrderDTO and return it
	        return convertToOrderDTO(savedOrder);
	    }
	 @Override
	    public void deleteOrder(Long UserId, Long menuId, String menuItem, int quantity) {
	        // Retrieve the order based on the provided customerId, menuItemId, and quantity
	        Order order = orderRepository.findByUserIdAndMenuIdAndMenuItemAndQuantity(UserId, menuId,menuItem, quantity)
	                .orElseThrow(() -> new OrderNotFoundException("Order not found with customer ID: " + customerId
	                        + ", menu item ID: " + menuItemId + ", and quantity: " + quantity));
	        
	        // Delete the order using the repository
	        orderRepository.delete(order);
	    }
	 
	 public OrderDTO convertToOrderDTO(final Order order) {
	        final OrderDTO oDto = new OrderDTO();
	        if (order != null) {
	            BeanUtils.copyProperties((Object)order, (Object)oDto);
	        }
	        return oDto;
	    }
	    
	    public Order convertToOrderEntity(final OrderDTO oDto) {
	        final Order order = new Order();
	        if (oDto != null) {
	            BeanUtils.copyProperties((Object)oDto, (Object)order);
	        }
	        return order;
	    }

}

	
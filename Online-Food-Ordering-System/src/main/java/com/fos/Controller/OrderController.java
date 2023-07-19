package com.fos.Controller;

import java.util.List;

import org.slf4j.LoggerFactory;
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

import com.fos.entity.Menu;
import com.fos.entity.Order;
import com.fos.entity.Restaurant;
import com.fos.model.OrderDTO;
import com.fos.model.RestaurantDTO;
import com.fos.service.MenuService;
import com.fos.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	 @PostMapping("/create")
	    public ResponseEntity<OrderDTO> PlaceOrder(@RequestBody OrderDTO orderDTO) {
	        OrderDTO createdOrder = orderService.placeOrder(orderDTO.getOrderId(), orderDTO.getMenuItem(), orderDTO.getQuantity());
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
	    }

	    @GetMapping("/{orderId}")
	    public ResponseEntity<OrderDTO> getOrder(@PathVariable("orderId") Long orderId) {
	        OrderDTO order = orderService.getOrderById(orderId);
	        return ResponseEntity.ok(order);
	    }
	    @GetMapping(value= "/getAllMenus")
		public ResponseEntity<List<Menu>>getAllMenus(){
			List<Menu>menuList= MenuService.getAllMenus();
			return ResponseEntity.ok(menuList);
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

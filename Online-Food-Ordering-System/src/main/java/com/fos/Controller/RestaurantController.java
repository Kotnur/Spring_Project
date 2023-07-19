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

import com.fos.entity.Restaurant;
import com.fos.entity.User;
import com.fos.model.RestaurantDTO;
import com.fos.model.UserDTO;
import com.fos.service.RestaurantService;
import com.fos.service.UserService;

@RestController
@RequestMapping("/users")
public class RestaurantController {
	
	 private final RestaurantService restaurantService;
	 
	 @Autowired
	 public RestaurantController(RestaurantService restaurantService) {
	        this.restaurantService = restaurantService;
	    }
	 
	 @PostMapping
	    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
	        // Map RestaurantDTO to Restaurant entity
	        Restaurant restaurant = convertToRestaurantEntity(restaurantDTO);
	        
	        // Call the service method to create the restaurant
	        Restaurant createdRestaurant = restaurantService.createRestaurant(restaurant);
	        
	        // Map the createdRestaurant entity back to RestaurantDTO
	        RestaurantDTO createdRestaurantDTO = convertToRestaurantDTO(createdRestaurant);
	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdRestaurantDTO);
	    }
	 
	 @GetMapping("/{restaurantId}")
	    public ResponseEntity<RestaurantDTO> getRestaurantById(@PathVariable Long restaurantId) {
	        // Call the service method to retrieve the restaurant
	        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
	        
	        // Map the restaurant entity to RestaurantDTO
	        RestaurantDTO restaurantDTO = convertToRestaurantDTO(restaurant);
	        
	        if (restaurantDTO != null) {
	            return ResponseEntity.ok(restaurantDTO);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	        
	        public RestaurantDTO convertToRestaurantDTO(final Restaurant restaurant) {
		        final RestaurantDTO rDto = new RestaurantDTO();
		        if (restaurant != null) {
		            BeanUtils.copyProperties((Object)restaurant, (Object)rDto);
		        }
		        return rDto;
		    }
		    
		    public Restaurant convertToRestaurantEntity(final RestaurantDTO rDto) {
		        final Restaurant restaurant = new Restaurant();
		        if (rDto != null) {
		            BeanUtils.copyProperties((Object)rDto, (Object)restaurant);
		        }
		        return restaurant;
		    }
	
}

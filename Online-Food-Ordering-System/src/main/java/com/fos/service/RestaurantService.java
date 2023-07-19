package com.fos.service;

import com.fos.entity.Restaurant;
import com.fos.model.RestaurantDTO;

public interface RestaurantService {
	

    
    RestaurantDTO createRestaurant(final Restaurant restaurant);
    
    RestaurantDTO getRestaurantById(final int restaurantId);
   

}

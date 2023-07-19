package com.fos.util;

import org.springframework.beans.BeanUtils;

import com.fos.entity.Restaurant;
import com.fos.model.RestaurantDTO;

public class RestaurantConverter {
	
	//convert User entity into userDTO
    public RestaurantDTO convertToRestaurantDTO(final Restaurant restaurant) {
        final RestaurantDTO rDto = new RestaurantDTO();
        if (restaurant != null) {
            BeanUtils.copyProperties((Object)restaurant, (Object)rDto);
        }
        return rDto;
    }
    
    public Restaurant convertTorestaurantEntity(final RestaurantDTO rDto) {
        final Restaurant restaurant = new Restaurant();
        if (rDto != null) {
            BeanUtils.copyProperties((Object)rDto, (Object)restaurant);
        }
        return restaurant;
    }

}

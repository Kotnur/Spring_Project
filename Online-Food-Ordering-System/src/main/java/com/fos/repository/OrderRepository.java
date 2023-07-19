package com.fos.repository;

import com.fos.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Object findByUserIdAndMenuIdAndMenuItemAndQuantity(Long userId, Long menuId, String menuItem, int quantity);

}

package com.elwgomes.project.repositories;

import com.elwgomes.project.entities.OrderItem;
import com.elwgomes.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

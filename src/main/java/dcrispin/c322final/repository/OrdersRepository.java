package dcrispin.c322final.repository;


import dcrispin.c322final.model.Flower;
import dcrispin.c322final.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();
}
package repository;

import model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersFileRepository {
    OrdersRepository ordersRepository;

    public OrdersFileRepository(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Order> findAllByUsername(String username){
        List<Order> list = ordersRepository.findAll();
        List<Order> orders = new ArrayList<>();
        for (Order o : list){
            if (o.getUsername().equals(username)){
                orders.add(o);
            }
        }
        return orders;
    }
}

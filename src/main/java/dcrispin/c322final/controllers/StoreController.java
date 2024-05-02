package controllers;

import model.Customer;
import model.Flower;
import model.Order;
import org.springframework.web.bind.annotation.*;
import repository.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/store")
public class StoreController {
    /*
    "POST /signup"X
    "POST /login"X
    "GET /flowers" need to return a list of all flowers
    "POST /orders" need to save an order to the DB
    "GET /orders/{customerId}" retrieve an order by customer ID
     */
    //private FlowersFileRepository flowersFileRepository;
    private FlowersRepository flowersRepository;
    private OrdersFileRepository ordersFileRepository;
    private OrdersRepository ordersRepository;
    //private CustomerRepository customerRepository;

    public StoreController(//FlowersFileRepository flowersFileRepository,
                           FlowersRepository flowersRepository,
                           OrdersFileRepository ordersFileRepository,
                           OrdersRepository ordersRepository)
                           //CustomerRepository customerRepository
                           {
        //this.flowersFileRepository = flowersFileRepository;
        this.flowersRepository = flowersRepository;
        this.ordersFileRepository = ordersFileRepository;
        this.ordersRepository = ordersRepository;
        //this.customerRepository = customerRepository;
    }

    @GetMapping("/flowers")
    public List<Flower> findFlowers(){
        return flowersRepository.findAll();
    }

    @PostMapping("/orders")
    public void saveOrder(@RequestBody Order order){
        try {ordersRepository.save(order);}
        catch (Exception e) {throw new RuntimeException(e);}
    }

    @GetMapping("/orders/{customerId}")
    public List<Order> findOrders(@PathVariable String customerId){
        //Customer customer = customerRepository.findByUsername(customerId);
        return ordersFileRepository.findAllByUsername(customerId); //TODO Need to make a function to do this
    }
}

package com.example.shippingservice.Controller;



import com.example.orderservice.entity.Order;
import com.example.orderservice.model.OrderUser;
import com.example.orderservice.model.User;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.service.ServiceUser;
import com.example.shippingservice.entity.Shiper;
import com.example.shippingservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShiperControler {

    @Autowired
    private UserService serviceUser;
    @Autowired
    private ShiperControler orderRepository;

//    @CacheEvict(value = "findAll", allEntries = true)
//    public void evictAllCacheValues() {}

    //    @Cacheable(value = "findAll")
    @GetMapping("/allusers")
    public List<Shiper> findAll() {
        return new ArrayList<>(serviceUser.findAll());
    }

    @GetMapping("/findOrderWithUser/{id}")
    public UserService findOrderWithUser(@PathVariable("id") int id) {
        ShiperId order = orderRepository.findById(id).get();
        Shiper user = serviceUser.findById(order.getShipperId());
        return new Shiper(Shiper,user);
    }
}

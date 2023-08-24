package com.springjpa.course.resources;

import com.springjpa.course.entities.Order;
import com.springjpa.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAll(){
        List orders = orderService.findAll();
        return ResponseEntity.ok().body(orders);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> getById(@PathVariable Long id){
        Order order = orderService.findById(id);
        if(order != null){
            return ResponseEntity.ok().body(order);
        }
        return null;
    }

}

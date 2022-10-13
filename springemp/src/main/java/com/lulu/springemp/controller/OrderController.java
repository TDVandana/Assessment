package com.lulu.springemp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.Order;
import com.lulu.springemp.repo.OrderRepo;
@CrossOrigin
@RestController

public class OrderController {
    
	@Autowired
	OrderRepo orderRepo;
    
    @PostMapping("/addorder")
    public Order createorder(@RequestBody Order order) {
        return orderRepo.save(order);
    }
    @GetMapping("/getorders")
    public List<Order> getAllOrders(){
        
        return orderRepo.findAll();     //select * from product;
    }    
    
}

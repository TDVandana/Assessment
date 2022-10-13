package com.lulu.springemp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.TableOrder;
import com.lulu.springemp.repo.TableOrderRepo;
@CrossOrigin
@RestController

public class TableOrderController {
    
	@Autowired
	TableOrderRepo tableorderRepo;
    
    @PostMapping("/addtableorder")
    public TableOrder createtableorder(@RequestBody TableOrder tableorder) {
        return tableorderRepo.save(tableorder);
    }
    @GetMapping("/gettableorders")
    public List<TableOrder> getAllTableOrders(){
        
        return tableorderRepo.findAll();     //select * from product;
    }    
    
    
    @DeleteMapping("/deleteusers/{id}")
    public String  deleteUser(@PathVariable("id") int id)
    {
       
        tableorderRepo.deleteById(id);
        System.out.println("Item got deleted");
        
        return  "Is deleted";
    }
    
    
    @DeleteMapping("/deleteuserss/{id1}/{id2}")
    public String  deleteUsers(@PathVariable("id1") int id1,@PathVariable("id2") int id2)
    {
       
        tableorderRepo.deleteById(id1);
        System.out.println("Record 1 got deleted");
        tableorderRepo.deleteById(id2);
        System.out.println("Record 2 got deleted");
        
        return  "Is deleted";
    }
    
    @PutMapping("/users/{id}")   //

    public ResponseEntity<TableOrder> updateEmployee(@PathVariable("id") int id, @RequestBody TableOrder tableorder){

        TableOrder table_order = tableorderRepo.findById(id)

                .orElseThrow(() -> new RuntimeException("User not exist with id :" + id));

        

        tableorder.setId(tableorder.getId());

        tableorder.setName(tableorder.getName());

        tableorder.setEmailId(tableorder.getEmailId());

        tableorder.setPassword(tableorder.getPassword());

        

        TableOrder updatedUser = tableorderRepo.save(tableorder);

        return ResponseEntity.ok(updatedUser);

    }
    
    
    
}

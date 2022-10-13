package com.lulu.springemp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import com.lulu.springemp.entity.HelpDesk;



import com.lulu.springemp.repo.HelpDeskRepo;





@CrossOrigin



@RestController







public class HelpDeskController {



    



    @Autowired



    HelpDeskRepo helpdeskRepo;



    



    @PostMapping("/addcomplaints")



    public HelpDesk createcomplaint(@RequestBody HelpDesk helpdesk) {



        return helpdeskRepo.save(helpdesk);



    }



    @GetMapping("/getcomplaints")



    public List<HelpDesk> getAllComplaints(){



        



        return helpdeskRepo.findAll();     //select * from product;



    }    



    



}
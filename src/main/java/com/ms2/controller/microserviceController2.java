package com.ms2.controller;

import com.ms2.client.Clientfromms2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class microserviceController2 {
    @Autowired
    private Clientfromms2 clientfromms2;
    @GetMapping("/ms2")
    public String callmicroservice1(){
        return clientfromms2.getdata();
    }
}

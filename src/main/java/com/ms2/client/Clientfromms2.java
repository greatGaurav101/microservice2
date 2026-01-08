package com.ms2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms1")
public interface Clientfromms2 {
    @GetMapping("/message")
    public String getdata();
}

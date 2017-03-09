package com.od.twelvefactorex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealsService {


    @RequestMapping("/deals")
    public String greeting(@RequestParam(value="id") String id) {
        return "Deal " + id;
    }
}
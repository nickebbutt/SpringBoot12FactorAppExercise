package com.od.twelvefactorex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealsService {


    @RequestMapping("/deals")
    public String greeting(@RequestParam(value="id") String id) {
        switch(id) {
            case "1" :
                return "Buy 400 pairs, get one unmatched sock free!";
            case "2" :
                return "Free shipping anywhere in the Andromeda Galaxy";
            default :
                return "A Random Deal " + Math.random();
        }
    }
}
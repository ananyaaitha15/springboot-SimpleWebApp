package com.learning.simpleWebApp.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // tells that not looking for file for data so return data
// @Controller //tells server this is controller
public class HomeController {

    @RequestMapping("/") // we have many pages and each request handled separately
    // @ResponseBody // returns data if we use this use controller at start
    public String greet(){
        return "Welcome Ananya!!!";
    }
    
    @RequestMapping("/about")
    public String about(){
        return "this page tells about ananya, she is a girll!!";
    }

}

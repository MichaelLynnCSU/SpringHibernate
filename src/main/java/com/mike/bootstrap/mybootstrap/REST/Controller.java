package com.mike.bootstrap.mybootstrap.REST;
import com.google.gson.Gson;
import com.mike.bootstrap.mybootstrap.MODEL.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

        @Autowired
        private Service topService;


    // get is default method
    @RequestMapping("/")
    public String sayHi(){
        topService.say();
        return "hi";
    }

   //  get is default method
    @RequestMapping("/hello2")
    public String sayHi2(){
        return topService.say();
    }

    //  get is default method
    @RequestMapping("/getList")
    public String sayHi3()
    {
        topService.say();
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        Gson gson = new Gson();
        String test = gson.toJson(messages);
        return test;
    }

}

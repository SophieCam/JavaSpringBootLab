package com.example.week13day4Lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping ("/home")
    public void String (){

    }

    @GetMapping ("/about")
    public String yourName (){
        return "Hello my Name is Sophie";

    }

}

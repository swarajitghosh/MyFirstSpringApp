package dev.swarajit.myfirstsprinfapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @RequestMapping("/hello")
public String sayHelloToAPerson(){
return "Hello";
}
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return " Hello " + name;
    }

//Test ready for commit
}

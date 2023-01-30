package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called");
        this.myService = myService;
    }
    @GetMapping
    public String helloMsg(){
        return "Hello, Welcome to Localhost!";
    }
    @GetMapping("/getName")
    public String getName(){
        return myService.getName();
    }

}

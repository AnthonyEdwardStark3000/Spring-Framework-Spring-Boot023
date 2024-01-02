package com.springboot.springbootfirstproject.Controller;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Used to make this method a Spring MVC controller
//@ResponseBody // Used to tell the Controller that the Object returned is automatically
//              // Serialized into JSON and passed back into the HttpResponse Object
@RestController // Is a combination of the above-mentioned two annotations.
public class HelloWorldController {
    // HTTP GET
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Happy New Year !";
    }
}

package io.github.minhaz1217.springboot_mongodb_tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class ViewController {
    //@RequestMapping("/")
    //@ResponseBody
    String home(){
        return "THIS IS THE HOME PAGE";
    }
}

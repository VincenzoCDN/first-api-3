package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {


    @GetMapping ("/strings")
    public String getString(@RequestParam (value = "s1", required = true) String s1, @RequestParam (value = "s2", required = false) String s2){
        if (s2 ==null){
            return s1;
        } else {
            return s1 + s2;
        }
    }


}

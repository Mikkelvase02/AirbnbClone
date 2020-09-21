package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class myController {



    @ResponseBody
    @GetMapping ("/homePage")
    public String homePage() {return "landingPage";}

}

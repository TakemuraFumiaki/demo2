package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domein.Car;

@Controller
@RequestMapping("variable-expressions")
public class VariableExpressionController {

    @RequestMapping("")
    public String index(Model model){
        
        model.addAttribute("name", "tobita");
        
        Car car = new Car(100,"bentsu",50);
        model.addAttribute("car", car);
    
        return "variable-experssions";
    }

}

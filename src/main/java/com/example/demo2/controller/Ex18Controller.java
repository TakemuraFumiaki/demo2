package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domein.User;
import com.example.demo2.form.Haoma;
import com.example.demo2.form.UserForm;
import com.example.demo2.service.UserService;

@Controller
@RequestMapping("/start")
public class Ex18Controller {

    @ModelAttribute
    public Haoma setHaomaform(){
        return new Haoma();
    }

    @RequestMapping("")
    public String index(Model model){
        return "ex-19-input";
    }

    @RequestMapping("/start-second")
    public String second(@Validated Haoma form,BindingResult result,RedirectAttributes redirectAttributes,Model model){

        if(result.hasErrors()){
            return index(model);
        }

        int total =0;
        int a = Integer.parseInt(form.getLeft());
        int b = Integer.parseInt(form.getRight());
        total = a+b;

        form.setCalc(total);

        model.addAttribute("total",total);

        return "ex-19-result";
    }
}

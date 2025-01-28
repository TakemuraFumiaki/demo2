package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domein.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;

@Controller
@RequestMapping("yi")
public class Ex17QuestionnaireContoroller {

    @ModelAttribute
    public Ex17QuestionnaireForm setUpForm(){
        return new Ex17QuestionnaireForm();
    }


    @RequestMapping("")
    public String index(Model model){

        Map <Integer,String> hobbyMap = new LinkedHashMap<>();

        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");

        model.addAttribute("hobbyMap", hobbyMap);
        
        return "ex-17-input";
    }

    @RequestMapping("/er")
    public String er(@Validated Ex17QuestionnaireForm form,BindingResult result, RedirectAttributes redirectAttributes,Model model){

        if(result.hasErrors()){
            return index(model);
        }

        Questionnaire questionnaire = new Questionnaire();
        BeanUtils.copyProperties(form, questionnaire);

        List<String> hobbyList = new ArrayList<>();
        for(Integer hobbycode : form.getHobbyList()){
            if(hobbycode==1){
                hobbyList.add(0,"野球");
            }else if(hobbycode==2){
                hobbyList.add(1,"サッカー");
            }else if(hobbycode==3){
                hobbyList.add(2,"テニス");
            }
        }
        questionnaire.setHobbyList(hobbyList);

        redirectAttributes.addFlashAttribute("questionnaire",questionnaire);

        return "redirect:/yi/san";
    }

    @RequestMapping("/san")
    public String san(){
        return "ex-17-result";
    }
}

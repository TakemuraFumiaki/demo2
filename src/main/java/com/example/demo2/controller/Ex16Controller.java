package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo2.domein.User;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/first")
public class Ex16Controller {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("")
    public String index(Model model) {
        List<User> userList = (List<User>) servletContext.getAttribute("userList");

        if (userList == null) {
            userList = new ArrayList<>();
            servletContext.setAttribute("userList", userList);
        }

        model.addAttribute("userList", userList); // ビューに渡す
        return "ex-16";
    }

    @RequestMapping("/second")
    public String index(String name, String text) {
        List<User> userList = (List<User>) servletContext.getAttribute("userList");

        if (userList == null) {
            userList = new ArrayList<>();
            servletContext.setAttribute("userList", userList);
        }

        userList.add(new User(name, text));
        return "redirect:/first"; // POST後にリダイレクト
    }
}

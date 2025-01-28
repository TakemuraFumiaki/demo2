package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo2.domein.User2;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/first")
public class Ex16Controller {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("")
    public String index() {
        @SuppressWarnings("unchecked")
        List<User2> userList = (List<User2>) servletContext.getAttribute("userList");

        if (userList == null) {
            userList = new ArrayList<>();
            servletContext.setAttribute("userList", userList);
        }

        return "ex-16";
    }

    @RequestMapping("/second")
    public String second(String name, String text) {
        @SuppressWarnings("unchecked")
        List<User2> userList = (List<User2>) servletContext.getAttribute("userList");

        userList.add(0,new User2(name, text));
        servletContext.setAttribute("userList", userList);
        return "ex-16"; // POST後にリダイレクト
    }
}

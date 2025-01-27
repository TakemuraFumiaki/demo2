package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domein.Item;

@Controller
@RequestMapping("/each")
public class EachConftroller {

    @RequestMapping("")
    public String index(Model model){

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("鉛筆",120,"緑"));
        itemList.add(new Item("パソコン",180000,"ゴールド"));
        itemList.add(new Item("洗濯機",340000,"白"));

        model.addAttribute("itemlist",itemList);
        return "each";
    }

}

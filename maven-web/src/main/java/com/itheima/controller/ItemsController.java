package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @RequestMapping("/findOne")
    public String findOneById(Model model){
        Items itemsById = itemsService.findItemsById(1);
        model.addAttribute("item",itemsById);
        return "itemDetail";
    }
}

package com.localbizdirectory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping("/index")
    public String viewHomePage(Model model) {
        //model.addAttribute("allCatList", "list");
        return "index";
    }
}

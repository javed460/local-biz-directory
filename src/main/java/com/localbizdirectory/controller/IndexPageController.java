package com.localbizdirectory.controller;

import com.localbizdirectory.entity.BusinessCategory;
import com.localbizdirectory.service.BusinessCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexPageController {
    private final BusinessCategoryService businessCategoryService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<BusinessCategory> categories = businessCategoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "index";
    }
}

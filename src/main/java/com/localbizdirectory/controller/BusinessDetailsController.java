package com.localbizdirectory.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/business-details")
public class BusinessDetailsController {

    @GetMapping("/{category}")
    public String getBusinessDetails(@PathVariable String category) {
        return "testing";
    }
}

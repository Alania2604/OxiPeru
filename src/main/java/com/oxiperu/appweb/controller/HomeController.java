package com.oxiperu.appweb.controller;

import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.model;


@controller
public class HomeController{

    private static final String HOME_INDEX="welcome";

    @GetMapping("/")
    public String index(Model model){
        return HOME_INDEX;
    }
}
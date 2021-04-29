package com.oxiperu.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ContactoController{
    private static final String INDEX="contacto/create";

    @GetMapping("/contacto/create")
    public String index(Model model){
        return INDEX;
    }
    
}
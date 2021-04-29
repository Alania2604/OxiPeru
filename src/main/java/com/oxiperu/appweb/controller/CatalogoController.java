package com.oxiperu.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;


import com.oxiperu.appweb.model.Catalogo;

@Controller
public class CatalogoController{
    private static final String INDEX="catalogo/index";

    @GetMapping("/catalogo/index")
    public String index(Model model){
        return INDEX;
    }
   
  
}
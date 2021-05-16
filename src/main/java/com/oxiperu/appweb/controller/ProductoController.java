package com.oxiperu.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

import com.oxiperu.appweb.model.Producto;

@Controller
public class ProductoController{
    private static final String INDEX="producto/index";

    @GetMapping("/producto/index")
    public String index(Model model){
        return INDEX;
    }
   
  
}

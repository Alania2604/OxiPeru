package com.oxiperu.appweb.controller;

import com.oxiperu.appweb.model.contacto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class ContactoController{

    @GetMapping("/contacto")
    public String contacto(Model model){
        contacto contacto =new contacto();
        model.addAttribute("contacto", contacto);
        return "contacto/index";
    }

    @PostMapping("/contacto/create")
    public String postSubmitForm(Model model){
        model.addAttribute("mensaje", "se registro un contacto");
        return "contacto/index.html";
    }
    
}
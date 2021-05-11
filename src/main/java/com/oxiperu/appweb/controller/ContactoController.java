package com.oxiperu.appweb.controller;


import com.oxiperu.appweb.model.contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ContactoController{
    private static final String INDEX="contacto/create";


    @GetMapping("/")
    public String contacto(Model model){
        contacto contacto =new contacto();
        model.addAttribute("contacto", contacto);
        return "contacto/index";
    }

   @PostMapping("/contacto/create")
    public String postSubmitForm(Model model){
        contacto contacto =new contacto();
        model.addAttribute("contacto", contacto);
        model.addAttribute("mensaje", "Su registro fue exitoso");
        return "contacto/index";

    @GetMapping("/contacto/create")
    public String index(Model model){
        return INDEX;
    }
    
}
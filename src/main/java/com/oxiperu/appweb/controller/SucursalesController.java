package com.oxiperu.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SucursalesController {
    private static final String SUCURSALES_INDEX="sucursal";

    @GetMapping("/sucursal")
    public String index(Model model){
        return SUCURSALES_INDEX;
    }
}

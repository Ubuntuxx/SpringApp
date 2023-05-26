package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(Model model) {
        return "params/index";
    }

    @GetMapping("/mix-params")
    public String mixParams(@RequestParam String saludo, @RequestParam int numero, Model model) {
        model.addAttribute("resultado", "El saludo enviado es: " + saludo + " y el numero es: " + numero);
        return "params/mix-params";
    }

    @GetMapping("/string")
    public String param(@RequestParam(required = false) String texto, Model model) {
        model.addAttribute("resultado", "El parametro enviado es: " + texto);
        return "params/ver";
    }
}

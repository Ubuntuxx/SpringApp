package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/variables")
public class EjemploVariableRutaController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo","Enviar parametros de la ruta");
        return "variables/index";
    }


    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Recibir parámetros de la ruta @PathVariable");
        model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto);
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibir parámetros de la ruta @PathVariable");
        model.addAttribute("resultado", "El texto enviado en la ruta es: " + texto + " y el numero es: " + numero);
        return "variables/ver";
    }
}

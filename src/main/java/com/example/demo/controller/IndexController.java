package com.example.demo.controller;

import com.example.demo.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @RequestMapping(value = {"/maps", "/home", "/main"}, method = RequestMethod.GET)
    public String modelIndex(Model model) {
        model.addAttribute("titulo", "Hoa Spring");
        return "bainas";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Amador");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: " + usuario.getNombre());
        return "perfil";
    }
}

package com.Practica3Grupo9.controller;

import com.Practica3Grupo9.domain.ArbolDomain;
import com.Practica3Grupo9.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;
import java.util.Optional;

@Controller 
@RequestMapping("/arboles") 
public class ArbolController {

    @Autowired
    private ArbolService arbolService;

  
    @GetMapping("/index")
    public String index() {
        return "index";  
    }

 
    @GetMapping("/listas")
    public String listarArboles(Model model) {
        List<Arbol> arboles = arbolService.obtenerArboles(); 
        model.addAttribute("arboles", arboles);
        return "lista_arboles";  
    }

   
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("arbol", new Arbol());  
        return "formulario_arbol";  
    }

    @PostMapping("/guardar")
    public String guardarArbol(@ModelAttribute Arbol arbol) {
        arbolService.guardarArbol(arbol);  
        return "redirect:/arboles";  
    }

    @GetMapping("/editar/{id}")
    public String editarArbol(@PathVariable Long id, Model model) {
        Optional<Arbol> arbol = arbolService.obtenerArbolPorId(id);
        if (arbol.isPresent()) {
            model.addAttribute("arbol", arbol.get());
            return "formulario_arbol";  
        } else {
            return "redirect:/arboles"; 
        }
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarArbol(@PathVariable Long id) {
        arbolService.eliminarArbol(id);
        return "redirect:/arboles";
    }
}

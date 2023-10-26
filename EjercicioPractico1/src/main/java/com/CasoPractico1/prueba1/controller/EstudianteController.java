package com.CasoPractico1.prueba1.controller;

import com.CasoPractico1.prueba1.domain.Estudiante;
//import com.CasoPractico1.prueba1.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.CasoPractico1.prueba1.service.EstudianteService;

@Controller
@Slf4j
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var estudiante = estudianteService.getEstudiantes(false);
        model.addAttribute("estudiantes", estudiante);
        model.addAttribute("totalEstudiantes", estudiante.size());
        return "/estudiante/listado";
    }

    @GetMapping("/nuevo")
    public String estudianteNuevo(Estudiante estudiante) {
        return "/estudiante/modifica";
    }
    //@Autowired
    //private FirebaseStorageServiceImpl firebaseStorageService;

    @PostMapping("/guardar")
    public String categoriaGuardar(Estudiante estudiante) {
        
        estudianteService.save(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String categoriaEliminar(Estudiante estudiante) {
        estudianteService.delete(estudiante);
        return "redirect:/estudiante/listado";
    }

    @GetMapping("/modificar/{id}")
    public String categoriaModificar(Estudiante estudiante, Model model) {
        estudiante = estudianteService.getEstudiante(estudiante);
        model.addAttribute("estudiantes", estudiante);
        return "/estudiante/modifica";
    }

} 


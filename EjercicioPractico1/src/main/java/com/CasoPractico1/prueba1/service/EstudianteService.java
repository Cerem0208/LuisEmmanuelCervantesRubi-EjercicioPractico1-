package com.CasoPractico1.prueba1.service;


import com.CasoPractico1.prueba1.domain.Estudiante;
import java.util.List;

import java.util.List;

public interface EstudianteService {
    //Se obtiene un listado de categorias en un list
    public List<Estudiante> getEstudiantes (boolean activos);
    
  // Se obtiene un Arbol, a partir del id de un categoria
    public Estudiante getEstudiante(Estudiante estudiante);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Estudiante estudiante);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Estudiante estudiante);
    
}

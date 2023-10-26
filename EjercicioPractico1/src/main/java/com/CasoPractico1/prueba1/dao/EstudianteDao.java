package com.CasoPractico1.prueba1.dao;

import com.CasoPractico1.prueba1.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDao extends JpaRepository <Estudiante,Long>{
    
}
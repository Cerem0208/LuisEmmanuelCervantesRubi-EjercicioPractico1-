package com.CasoPractico1.prueba1.service.impl;

import com.CasoPractico1.prueba1.domain.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CasoPractico1.prueba1.dao.EstudianteDao;
import com.CasoPractico1.prueba1.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
     @Autowired
    private EstudianteDao estudianteDao;
    @Override
    @Transactional(readOnly=true)
    public List<Estudiante> getEstudiantes(boolean activos) {
        var lista=estudianteDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Estudiante getEstudiante(Estudiante estudiante) {
        return estudianteDao.findById(estudiante.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }
    
    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }
}

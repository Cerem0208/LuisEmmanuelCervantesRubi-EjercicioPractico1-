package com.CasoPractico1.prueba1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="estudiantes")
public class Estudiante implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String identificacion;
    private String nivel_cursando;
    private int edad;
    private int altura;
    private int peso;
    private String genero;
    private boolean activo;
    public Estudiante() {
    }
    public Estudiante(String estudiante, boolean activo) {
        this.identificacion = estudiante;
        this.activo = activo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pln.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alond
 */
public class AlumnosDTO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_alumno;
    private String nombre;
    private Integer edad;
    
    public AlumnosDTO() {
        super();
    }
    
    public AlumnosDTO(Integer id_alumno, String nombre, Integer edad){
        this.id_alumno=id_alumno;
        this.nombre=nombre;
        this.edad=edad;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}

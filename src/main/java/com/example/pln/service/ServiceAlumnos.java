/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pln.service;
import com.example.pln.DTO.AlumnosDTO;
import com.example.pln.entity.Alumnos_grupo;
import com.example.pln.entity.alumnos;
import java.util.List;

/**
 *
 * @author alond
 */
public interface ServiceAlumnos {
       
//servicio ´para listar todos los alumnos
    public List <alumnos> listAllalumnos();
//servicio ´para guardar alumno
    public alumnos savealumnos (alumnos alumnos);
    
    public List <Alumnos_grupo> listAllAlumnosGrupo();

    public alumnos findOneAlumno(Integer id_alumno);
    
    public List <AlumnosDTO> listAllAlumnosDTO();
    
    public alumnos saveAlumnosDTO (AlumnosDTO alumnos);
    
    public List <Object> listAllAlumnosObject();
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pln.servicelmpl;

import com.example.pln.DTO.AlumnosDTO;
import com.example.pln.entity.Alumnos_grupo;
import com.example.pln.entity.alumnos;
import com.example.pln.repository.Alumno_GrupoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pln.repository.AlumnosRepository;
import com.example.pln.service.ServiceAlumnos;

/**
 *
 * @author alond
 */
@Service
@Transactional
public class ServiceImplAlumnos implements ServiceAlumnos{

    @Autowired
    private AlumnosRepository alumnosRepository;
    
    @Autowired
    private Alumno_GrupoRepository Alumno_GrupoRepository ;
    
    @Override
    public List<alumnos> listAllalumnos() {
     return alumnosRepository.findAllalumnos();
    }

    public alumnos saveAlumnos(alumnos alumnos) {
        alumnos a=new alumnos();
        a.setNombre(alumnos.getNombre());
        a.setApellido_paterno(alumnos.getApellido_paterno());
        a.setApellido_materno(alumnos.getApellido_materno());
        a.setEdad(alumnos.getEdad());
        a.setGenero(alumnos.getGenero());
        return alumnosRepository.save(a);
    }   


    @Override
    public List<Alumnos_grupo> listAllAlumnosGrupo() {
        return Alumno_GrupoRepository.findAll();

    }
     @Override
     public alumnos findOneAlumno(Integer id_alumno) {
        return alumnosRepository.findOnealumnos(id_alumno);
}
     @Override
    public List<AlumnosDTO> listAllAlumnosDTO() {
        return alumnosRepository.findAllAlumnosDTO();

    }

    @Override
    public alumnos saveAlumnosDTO(AlumnosDTO alumnos) {
     alumnos a=new alumnos();
        a.setNombre(alumnos.getNombre());
        a.setEdad(alumnos.getEdad());
        return alumnosRepository.save(a);
    }

    @Override
    public List<Object> listAllAlumnosObject() {
        return alumnosRepository.findAllAlumnosObject();
    }

    @Override
    public alumnos savealumnos(alumnos alumnos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
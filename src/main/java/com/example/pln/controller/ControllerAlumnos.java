/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pln.controller;

import com.example.pln.DTO.AlumnosDTO;
import com.example.pln.entity.Alumnos_grupo;
import com.example.pln.entity.alumnos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.pln.service.ServiceAlumnos;

/**
 *
 * @author alond
 */
@RestController
@RequestMapping("/PLN")
public class ControllerAlumnos {
    @Autowired
    private ServiceAlumnos alumnosService;
    
    @GetMapping("/ListarAlumnos")
    public ResponseEntity<List<alumnos >> getAlumnos(){
        try {
            List<alumnos> alumnos=alumnosService.listAllalumnos();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    
    
    @PostMapping("/guardarAlumnos")
    public ResponseEntity<alumnos > createAlumnos(@RequestBody alumnos Alumnos){
        try {
            alumnos result=alumnosService.savealumnos(Alumnos);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
}
}
     @GetMapping("/ListarAlumnosGrupos")
    public ResponseEntity<List<Alumnos_grupo >> getAlumnosGrupo(){
        try {
            List<Alumnos_grupo> alumnos=alumnosService.listAllAlumnosGrupo();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    
    
    @GetMapping(value="/obtenAlumno/{alumno_id}")
    public ResponseEntity<alumnos> obtenAlumno(@PathVariable Integer alumno_id) {
        try {
            alumnos alumnos=alumnosService.findOneAlumno(alumno_id);
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    
    
    @GetMapping(value="/listarAlumnosDTO")
    public ResponseEntity<List<AlumnosDTO>> getAllAlumnosDTO () {
        try {
            List<AlumnosDTO> alumnos=alumnosService.listAllAlumnosDTO();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    
    @PostMapping(value="/guardarAlumnosDTO")
    public ResponseEntity<AlumnosDTO> CreateAlumnosDTO(@RequestBody AlumnosDTO alumnos) {
        try {
            alumnos result=alumnosService.saveAlumnosDTO(alumnos);
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }    
     @GetMapping(value="/listarAlumnosObject")
     public ResponseEntity<List<Object>> getAllAlumnosObject (){
        try {
            List<Object> alumnos=alumnosService.listAllAlumnosObject();
            return new ResponseEntity<>(alumnos,HttpStatus.OK);
        }catch(Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);    
      }
    }  
}
        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pln.repository;

import com.example.pln.DTO.AlumnosDTO;
import com.example.pln.entity.alumnos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 *
 * @author alond
 */
@Repository
public interface AlumnosRepository extends JpaRepository <alumnos,Integer> {
    @Query(value="SELECT * FROM alumnos",nativeQuery=true)
    List<alumnos> findAllalumnos();
    
    @Query(value="SELECT * FROM alumnos WHERE id_alumno= :alumno_id ", nativeQuery=true)
    alumnos findOnealumnos(@Param("alumno_id") Integer alumno_id);
    
    @Query(value="SELECT new com.exameple.pln.DTO.AlumnosDTO( id_alumno,nombre,edad) FROM Alumnos")
     List<AlumnosDTO> findAllAlumnosDTO();
    
    @Query(value="SELECT alumno_id,nombre,edad FROM alumnos ", nativeQuery=true)
    List<Object> findAllAlumnosObject();
    
}


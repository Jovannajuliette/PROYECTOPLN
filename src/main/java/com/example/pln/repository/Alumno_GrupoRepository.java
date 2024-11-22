/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pln.repository;

import com.example.pln.entity.Alumnos_grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alond
 */
@Repository
public interface Alumno_GrupoRepository extends JpaRepository<Alumnos_grupo,Integer>{
    
}

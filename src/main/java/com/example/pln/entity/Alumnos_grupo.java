/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pln.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author alond
 */
@Entity
@Table(name = "")
public class Alumnos_grupo implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id_grupo_alumno;
   @ManyToOne(fetch=FetchType.EAGER)
   @JoinColumn(name="alumno_id")
   private alumnos alumnos;
   @ManyToOne(fetch=FetchType.EAGER)
   @JoinColumn(name="grupos_id")
   private Grupo grupos;
   private Integer estatus;

    public Alumnos_grupo() {
        super();    
    }

    public Alumnos_grupo(Integer id_grupo_alumno, alumnos alumnos, Grupo grupos, Integer estatus) {
        this.id_grupo_alumno = id_grupo_alumno;
        this.alumnos = alumnos;
        this.grupos = grupos;
        this.estatus = estatus;
    }

    public Integer getId_grupo_alumno() {
        return id_grupo_alumno;
    }

    public void setId_grupo_alumno(Integer id_grupo_alumno) {
        this.id_grupo_alumno = id_grupo_alumno;
    }

    public alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Grupo getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

   
     
    
           
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.pruebaserver.controller;

import java.util.Date;
import org.lasalle.pruebaserver.model.Mascota;

/**
 *
 * @author axel_
 */
public class ControllerMascota {
   public static Mascota guardar(String nombre, String especie, Date fechaNacimiento){
       Mascota m = new Mascota();
       m.setNombre(nombre);
       m.setFechaNacimiento(fechaNacimiento);
       m.setEspecie(especie);
       m.setIdMascota((int)(Math.random()*50)+1);
       
       return m;
    } 
}

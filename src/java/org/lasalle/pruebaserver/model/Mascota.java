package org.lasalle.pruebaserver.model;

import java.util.Date;


/**
 *
 * @author axel_
 */
public class Mascota {
    private int idMascota;
    private String nombre;
    private String especie;
    private Date fechaNacimiento;
    private String sexo;
    private String tamaño;
    
    public Mascota(){
        
    }
    
    public Mascota(int idMascota,String nombre, String especie, Date fechaNacimiento, String sexo, String tamaño ){
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.tamaño = tamaño;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
}

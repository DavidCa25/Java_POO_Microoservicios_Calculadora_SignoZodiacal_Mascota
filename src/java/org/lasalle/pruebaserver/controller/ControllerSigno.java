/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.pruebaserver.controller;

/**
 *
 * @author axel_
 */
public class ControllerSigno {
   
    
    
    public String signoZodiacal(int dia, String mes){
        String signo = "";
        switch(mes){
            case "Enero":
                if(dia <= 20){
                    signo = "acuario";
                }else{
                    signo = "capricornio";
                }             
            break;
            case "Febrero":
                if(dia <= 19){
                    signo = "piscis";
                }else{
                    signo = "acuario";
                }
                break;
            case "Marzo":
                if(dia <= 21){
                    signo = "aries";
                }
                else{
                    signo = "piscis";
                }
                break;
            case "Abril":
                if(dia <= 20){
                    signo = "tauro";
                }else{
                    signo = "aries";
                }
            case "Mayo":
                if(dia <= 21){
                    signo = "geminis";
                }else{
                    signo = "tauro";
                }
                break;
            case " Junio":
                if(dia <= 21){
                    signo = "cancer";
                }else{
                    signo = "geminis";
                }
                break;
            case "Julio":
                if(dia <= 23){
                    signo = "leo";
                }else{
                    signo = "cancer";
                }
                break;
            case "Agosto":
                if(dia <= 23){
                    signo = "virgo";
                }else{
                    signo = "leo";
                }
                break;
            case "Septiembre":
                if(dia <= 23){
                    signo = "libra";
                }
                else{
                    signo = "virgo";
                }
                break;
            case "Octubre":
                if(dia <= 23){
                    signo = "escorpio";
                }
                else{
                    signo = "libra";
                }
                break;
            case "Noviembre":
                if(dia <= 23){
                    signo = "sagitario";
                }
                else{
                    signo = "escorpio";
                }
                break;
            case "Diciembre":
                if(dia <= 22){
                    signo = "capricorno";
                }
                else{
                    signo = "sagitario";
                }
                break; 
                
        }
        return signo;   
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.pruebaserver.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author axel_
 */
@Path("servicios")
public class RestPrueba {
    @Path("saludar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response saludar(){
        String out = """
                     {"respuesta":"hola desde Java"}
                     """;
        return Response.ok(out).build();
    }

    //Metodo get que recibe parametros
   @Path("saludarPersonalizado")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   
   public Response saludarPersonalizado(@QueryParam("nombre")String nombre){
      String out = """
                   {"respuesta":"Hola, como estas? %s %s "}
                   """;
      out = String.format(out, nombre, nombre);
      
      return Response.ok(out).build();
   }
   
   @Path("sumar")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response sumar(@QueryParam("numero1")int numero1, @QueryParam("numero2")int numero2){
      String out = """
                   {"respuesta":"La suma de %s + %s es = %s"}
                   """;
      float resultado = numero1 + numero2;
      out = String.format(out, numero1, numero2, resultado);
     
      return Response.ok(out).build();
   }
   
   @Path("resta")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response resta(@QueryParam("numero1")int numero1, @QueryParam("numero2")int numero2){
      String out = """
                   {"respuesta":"La resta de %s - %s es = %s"}
                   """;
      float resultado = numero1 - numero2;
      out = String.format(out, numero1, numero2, resultado);

      return Response.ok(out).build();
   }
   @Path("multiplicacion")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response multiplicación(@QueryParam("numero1")int numero1, @QueryParam("numero2")int numero2){
      String out = """
                   {"respuesta":"La multiplicacion de %s * %s es = %s"}
                   """;
      float resultado = numero1 * numero2;
      out = String.format(out, numero1, numero2, resultado);
      
      return Response.ok(out).build();
   }
   @Path("division")
   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Response división(@QueryParam("numero1")int numero1, @QueryParam("numero2")int numero2){
      String out = """
                   {"respuesta":"La division de %s / %s es = %s"}
                   """;
      float resultado = numero1 / numero2;
      out = String.format(out, numero1, numero2, resultado);
      
      return Response.ok(out).build();
   }
   
}

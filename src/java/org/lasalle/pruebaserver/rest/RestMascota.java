/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.pruebaserver.rest;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.lasalle.pruebaserver.controller.ControllerMascota;
import org.lasalle.pruebaserver.model.Mascota;


/**
 *
 * @author axel_
 */

@Path("mascota")
public class RestMascota {
    @Path("guardar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response guardar(@QueryParam("nombre") String nombre, @QueryParam("especie") String especie, @QueryParam("fechaNacimiento") String fechaNacimiento) {
    if (fechaNacimiento == null) {
        
        return Response.status(Response.Status.BAD_REQUEST).entity("La fecha de nacimiento es nula").build();
    }
    
    try {
        ControllerMascota cm = new ControllerMascota();
        SimpleDateFormat fechaN = new SimpleDateFormat("yyyy/MM/dd");
        Date f = fechaN.parse(fechaNacimiento);

        Mascota newPet = cm.guardar(nombre, especie, f);

        String out = """
                {"idMascota":"%s"}
                """;
        Gson gson = new Gson();
        out = gson.toJson(newPet);

        return Response.ok(out).build();
    } catch (ParseException e) {
      
        return Response.status(Response.Status.BAD_REQUEST).entity("La fecha de nacimiento no tiene un formato válido").build();
    }
    }
}


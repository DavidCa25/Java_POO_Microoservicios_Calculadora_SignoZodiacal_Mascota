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
import org.lasalle.pruebaserver.controller.ControllerSigno;
/**
 *
 * @author axel_
 */
@Path("signo")
public class RestSigno {
    @Path("guardar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response guardar(@QueryParam("dia") int dia, @QueryParam("mes") String mes) {
        ControllerSigno s = new ControllerSigno();
        String signo = """
                       {"respuesta":"Tu signo es %s"}
                       """;
        String resultado = s.signoZodiacal(dia, mes);
       
        signo = String.format(resultado);
        
        
        return Response.ok(signo).build();
    }
}

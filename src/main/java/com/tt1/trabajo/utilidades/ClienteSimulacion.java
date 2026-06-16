package com.tt1.trabajo.utilidades;

import org.springframework.stereotype.Component;

import io.swagger.client.ApiClient;
import io.swagger.client.api.SolicitudApi;
import io.swagger.client.model.Solicitud; 
import io.swagger.client.model.SolicitudResponse; 

@Component
public class ClienteSimulacion {

    private final SolicitudApi api;

    public ClienteSimulacion() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8080"); 
        
        this.api = new SolicitudApi(apiClient);
    }

    public Integer enviarSolicitud(Solicitud datos) {
        try {
            SolicitudResponse respuesta = api.solicitudSolicitarPost(datos, "prueba"); 
            return respuesta.getTokenSolicitud(); 
        } catch (Exception e) {
            System.err.println("Error al comunicar con la maquina virtual");
            return -1;
        }
    }
}

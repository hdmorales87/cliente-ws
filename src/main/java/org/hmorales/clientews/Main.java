package org.hmorales.clientews;

import org.hmorales.webapp.jaxws.services.ServicioWs;
import org.hmorales.webapp.jaxws.services.ServicioWsImplService;
import org.hmorales.webapp.jaxws.services.Curso;

public class Main {
    public static void main(String[] args) {
        ServicioWs service = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("el saludo: " + service.saludar("Andres"));

        Curso curso = new Curso();
        curso.setNombre("angular");
        Curso respuesta = service.crear(curso);
        System.out.println("nuevo curso: " + curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}
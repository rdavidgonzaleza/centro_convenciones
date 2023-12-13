package model;

import java.time.*;
import java.util.ArrayList;

public class EventoAcademico extends Eventos{

    public EventoAcademico() {
    }

    public EventoAcademico(String nombre, String descripcion, LocalDate fechaInicio, 
            LocalDate fechaFin, short capacidadMaxima, long valor, ArrayList listaActividades, ArrayList asistente) {
        super(nombre, descripcion, fechaInicio, fechaFin, capacidadMaxima, valor, listaActividades, asistente);
    }
    
}

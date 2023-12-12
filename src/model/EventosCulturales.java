package model;

import java.time.*;

public class EventosCulturales extends Eventos{

    public EventosCulturales() {
    }

    public EventosCulturales(
            String mesasDebate, String utileria, String nombre, String descripcion, LocalDate fechaInicio, 
            LocalDate fechaFin, short capacidadMaxima, long valor, Actividades[] listaActividades, Asistente[] asistentes) {
        super(nombre, descripcion, fechaInicio, fechaFin, capacidadMaxima, valor, listaActividades, asistentes);
        asistentes = new Asistente[capacidadMaxima];
    }
}

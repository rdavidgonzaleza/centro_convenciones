package model;

import java.time.*;

public class EventoAcademico extends Eventos{
    private String monitor;

    public EventoAcademico() {
    }

    public EventoAcademico(String monitor, String papeleria, String nombre, String descripcion, LocalDate fechaInicio, 
            LocalDate fechaFin, short capacidadMaxima, long valor, Actividades[] listaActividades, Asistente asistente[]) {
        super(nombre, descripcion, fechaInicio, fechaFin, capacidadMaxima, valor, listaActividades, asistente);
        asistente = new Asistente[capacidadMaxima];
        this.monitor = monitor;
    }
    
    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}

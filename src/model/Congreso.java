package model;

import java.time.*;

public class Congreso extends Eventos{

    public Congreso(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, short capacidadMaxima, 
            long valor, Actividades[] listaActividades, Asistente asistentes[]) {
        super(nombre, descripcion, fechaInicio, fechaFin, capacidadMaxima, valor, listaActividades, asistentes);
    }
    
}

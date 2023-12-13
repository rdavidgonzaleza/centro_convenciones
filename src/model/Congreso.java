package model;

import java.time.*;
import java.util.ArrayList;

public class Congreso extends Eventos{

    public Congreso(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, short capacidadMaxima, 
            long valor, ArrayList listaActividades, ArrayList asistentes) {
        super(nombre, descripcion, fechaInicio, fechaFin, capacidadMaxima, valor, listaActividades, asistentes);
    }
    
}

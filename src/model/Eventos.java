package model;

import java.sql.Date;
import java.time.*;
import java.util.ArrayList;
import java.util.Random;

public class Eventos {
    protected String nombre, descripcion;
    protected LocalDate fechaInicio, fechaFin;
    protected short capacidadMaxima;
    protected long valor;
    protected ArrayList <Actividades> listaActividades;
    protected ArrayList <Asistente> asistentes;
    
    
    public Eventos() {
    }

    public Eventos(String nombre, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, short capacidadMaxima, long valor, 
            ArrayList listaActividades,ArrayList asistentes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.capacidadMaxima = capacidadMaxima;
        this.valor = valor;
        this.listaActividades = listaActividades;
        this.asistentes = asistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public short getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(short capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public ArrayList getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList listaActividades) {
        this.listaActividades = listaActividades;
    }

    public ArrayList getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList asistentes) {
        this.asistentes = asistentes;
    }
    
    
}
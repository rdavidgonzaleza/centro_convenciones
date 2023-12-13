package model;

import java.util.ArrayList;

public class Actividades {
    private String descripcion;
    private int numeroPersonas;
    private ArrayList <Asistente> listaAsistentes;
    private SalonesCdC salones;
    
    public Actividades() {
    }

    public Actividades(String descripcion, int numeroPersonas, ArrayList listaAsistentes, SalonesCdC salones) {
        this.descripcion = descripcion;
        this.numeroPersonas = numeroPersonas;
        this.listaAsistentes = listaAsistentes;
        this.salones = salones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public ArrayList getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(ArrayList listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public SalonesCdC getSalones() {
        return salones;
    }

    public void setSalones(SalonesCdC salones) {
        this.salones = salones;
    }
    
}

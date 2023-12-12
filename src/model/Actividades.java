package model;

public class Actividades {
    private String descripcion;
    private int numeroPersonas;
    private Asistente[] listaAsistentes;
    private SalonesCdC salones;
    
    public Actividades() {
    }

    public Actividades(String descripcion, int numeroPersonas, Asistente[] listaAsistentes, SalonesCdC salones) {
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

    public Asistente[] getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(Asistente[] listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public SalonesCdC getSalones() {
        return salones;
    }

    public void setSalones(SalonesCdC salones) {
        this.salones = salones;
    }
    
}

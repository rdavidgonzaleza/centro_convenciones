package model;

public class SalonesCdC {
    private String nombre;
    private boolean disponibilidad;
    private int capacidad, nroSillas, nroMesas;
    private Eventos eventos;
    public SalonesCdC() {
    }
    public SalonesCdC(String nombre, boolean disponibilidad, int capacidad, int nroSillas, int nroMesas, Eventos eventos) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.capacidad = capacidad;
        this.nroSillas = nroSillas;
        this.nroMesas = nroMesas;
        this.eventos = eventos;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getNroSillas() {
        return nroSillas;
    }
    public void setNroSillas(int nroSillas) {
        this.nroSillas = nroSillas;
    }
    public int getNroMesas() {
        return nroMesas;
    }
    public void setNroMesas(int nroMesas) {
        this.nroMesas = nroMesas;
    }
    public Eventos getEventos() {
        return eventos;
    }
    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
    
}

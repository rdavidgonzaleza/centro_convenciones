package model;

public class Asistente {
    private String nombre, tipo, id, celular;
    private Eventos eventoId;
    private short edad;
    
    public Asistente() {
    }

    public Asistente(String nombre, String tipo, String id, String celular, short edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = id;
        this.celular = celular;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    
}

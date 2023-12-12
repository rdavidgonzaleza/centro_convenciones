package model;

public class CentroDeConvenciones {
    private SalonesCdC listaSalones;
    private String direccion;
    private boolean disponibilidad;

    public CentroDeConvenciones() {
    }

    public CentroDeConvenciones(SalonesCdC listaSalones, String direccion, boolean disponibilidad) {
        this.listaSalones = listaSalones;
        this.direccion = direccion;
        this.disponibilidad = disponibilidad;
    }

    public SalonesCdC getListaSalones() {
        return listaSalones;
    }

    public void setListaSalones(SalonesCdC listaSalones) {
        this.listaSalones = listaSalones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}

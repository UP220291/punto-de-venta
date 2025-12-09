package main.java.app.models;

public class Role {

    private int idRol;
    private String nombreRol;
    private boolean activo;

    public Role() {}

    public Role(int idRol, String nombreRol, boolean activo) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.activo = activo;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

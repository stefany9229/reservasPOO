package model;

public class User {
    private String nombre;
    private String documento;
    private String numeroDeContacto;

    public User(String nombre, String documento, String numeroDeContacto) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroDeContacto = numeroDeContacto;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }
}

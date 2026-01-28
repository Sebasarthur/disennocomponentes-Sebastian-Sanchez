package org.example.models;

public class cursoModel {
    private String id;
    private String nombre;
    private String descripcion;
    private String tiempo;
    private String usuario;

    // Constructor vacío y con argumentos
    public cursoModel() {}

    public cursoModel(String id, String nombre, String descripcion, String tiempo, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.usuario = usuario;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTiempo() { return tiempo; }
    public void setTiempo(String tiempo) { this.tiempo = tiempo; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Escuela {
    private String nombre;
    private String ciudad;
    private String telefono;
    private Rector rector;
    private Direccion direccion;

    public Escuela(String nombre, String ciudad, String telefono, Rector rector, Direccion direccion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.rector = rector;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}

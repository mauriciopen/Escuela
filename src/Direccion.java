/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Direccion {
    private int calle;
    private int carrera;
    private int numero;
    private String barrio;

    public Direccion(int calle, int carrera, int numero, String barrio) {
        this.calle = calle;
        this.carrera = carrera;
        this.numero = numero;
        this.barrio = barrio;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}

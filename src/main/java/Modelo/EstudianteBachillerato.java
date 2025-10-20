/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class EstudianteBachillerato extends Estudiante{
    private String nivelDeIgles;
    private double horasServicioSocial;

    public EstudianteBachillerato() {
    }
    public EstudianteBachillerato(String nombre, String direccion, String telefono, String fechaNacimiento,
                                  int codigo, int grado, double horasServicioSocial, String nivelDeIngles) {
        super(nombre, direccion, telefono, fechaNacimiento, codigo, grado);
        this.horasServicioSocial = horasServicioSocial;
        this.nivelDeIgles = nivelDeIngles;
    }

    public double getHorasServicioSocial() {
        return horasServicioSocial;
    }

    public String getNivelIngles() {
        return nivelDeIgles;
    }    
}

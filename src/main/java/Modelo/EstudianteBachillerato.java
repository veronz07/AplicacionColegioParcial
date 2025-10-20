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
    private String nivelDeIngles;
    private double horasServicioSocial;

    public EstudianteBachillerato() {
    }
    public EstudianteBachillerato(String nombre, String direccion, String telefono, String fechaNacimiento,
                                  int codigo, int grado, double horasServicioSocial, String nivelDeIngles) {
        super(nombre, direccion, telefono, fechaNacimiento, codigo, grado);
        this.horasServicioSocial = horasServicioSocial;
        this.nivelDeIngles = nivelDeIngles;
    }

    public double getHorasServicioSocial() {
        return horasServicioSocial;
    }

    public String getNivelIngles() {
        return nivelDeIngles;
    }  
    @Override
    public String toString() {
        return super.toString() +
               ", Horas de servicio social: " + horasServicioSocial +
               ", Nivel de inglés: " + nivelDeIngles;
    }
}

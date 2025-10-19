/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class Profesor extends Persona{
    
    private String cedula;
    private String area;
    private double salarioHora;
    private int horasTrabajadas;

    public Profesor() {
        super();
    }

    public Profesor(String cedula, String area, double salarioHora, int horasTrabajadas, String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }  
}

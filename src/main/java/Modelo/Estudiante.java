/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class Estudiante extends Persona {
    private int codigo;
    private int grado;
    
    public Estudiante(){}

    public Estudiante(int codigo, int grado, String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.grado = grado;
    } 
}

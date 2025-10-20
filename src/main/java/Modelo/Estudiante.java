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
    protected int codigo;
    public int grado;
    
    public Estudiante(){}

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento, int codigo, int grado) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.grado = grado;
    } 

    public int getGrado() {
        return grado;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                ", Código: " + codigo +
                ", Grado: " + grado;
    }
}

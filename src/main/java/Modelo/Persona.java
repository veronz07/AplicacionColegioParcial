/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class Persona {
    public String nombre;
    protected String direccion;
    protected String telefono;
    protected String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre
                + ", Dirección: " + direccion
                + ", Teléfono: " + telefono
                + ", Fecha de nacimiento: " + fechaNacimiento;
    }
}

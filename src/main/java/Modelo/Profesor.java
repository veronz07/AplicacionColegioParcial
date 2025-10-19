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
    
    public double calcularPagoMensual(){
        double pago = salarioHora*horasTrabajadas;
        return pago + (pago*0.2);
    }
        
    public double calcularPrestaciones(){
        return calcularPagoMensual()*0.17;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                ", Cédula: " + cedula +
                ", Área: " + area +
                ", Salario por hora: " + salarioHora +
                ", Horas Trabajadas: " + horasTrabajadas +
                ", Pago mensual: " + calcularPagoMensual() +
                ", Prestaciones: " + calcularPrestaciones();
    }
}

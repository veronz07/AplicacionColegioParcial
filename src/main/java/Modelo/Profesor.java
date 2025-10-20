/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Profesor extends Persona {
    
    private String cedula;
    private String area;
    private double salarioHora;
    private double horasTrabajadas;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento, 
                    String cedula, String area, double salarioHora, double horasTrabajadas) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Método original: cálculo con bonificación fija del 20%
    public double calcularPagoMensual() {
        double pago = salarioHora * horasTrabajadas;
        return pago + (pago * 0.2);
    }

    //  Método sobrecargado: permite pasar un porcentaje distinto
    public double calcularPagoMensual(double porcentajeBonificacion) {
        double pago = salarioHora * horasTrabajadas;
        return pago + (pago * porcentajeBonificacion / 100.0);
    }

    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.17;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cédula: " + cedula +
                ", Área: " + area +
                ", Salario por hora: " + salarioHora +
                ", Horas Trabajadas: " + horasTrabajadas +
                ", Pago mensual: " + calcularPagoMensual() +
                ", Prestaciones: " + calcularPrestaciones();
    }
}

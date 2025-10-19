/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.*;

/**
 *
 * @author Vero
 */
public class Colegio {
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;
    
    public Colegio(){
        profesores= new ArrayList<>();
        estudiantes= new ArrayList<>();
    }
    public void registrarProesor(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        String direccion= JOptionPane.showInputDialog("Ingrese la dirección de residencia: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el número telefónico: ");
        String fechaNacimiento= JOptionPane.showInputDialog("Ingrese la fecha de nacimiento: ");
        String cedula= JOptionPane.showInputDialog("Ingrese la cédula: ");
        String area = JOptionPane.showInputDialog("Ingrese la materia que enseña");
        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario por hora: "));
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
        
        Profesor p = new Profesor(nombre, direccion, telefono, fechaNacimiento, cedula, area, salarioHora, horasTrabajadas);
        
        profesores.add(p);
        
        JOptionPane.showMessageDialog(null,"Profesor registrado exitosamente.");
    } 
    
    public void registrarEstudiante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String direccion = JOptionPane.showInputDialog("Ingrese la Dirección de residencia:");
        String telefono = JOptionPane.showInputDialog("Ingrese el Teléfono de contacto con el acudiente:");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la Fecha de nacimiento:");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Código del estudiante:"));
        int grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Grado que cursa el estudiante:"));

        Estudiante e = new Estudiante(nombre, direccion, telefono, fechaNacimiento, codigo,grado);
        estudiantes.add(e);

        JOptionPane.showMessageDialog(null, "Estudiante registrado exitosamente.");
    }
     
}

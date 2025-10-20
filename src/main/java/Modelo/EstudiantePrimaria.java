/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class EstudiantePrimaria extends Estudiante {
    private String programasApoyo;
    private String nivelComprensionLectora;

    public EstudiantePrimaria() {
    }
    

    public EstudiantePrimaria(String nombre, String direccion, String telefono, String fechaNacimiento,
                              int codigo, int grado, String programasApoyo, String nivelComprensionLectora) {
        super(nombre, direccion, telefono, fechaNacimiento, codigo, grado);
        this.programasApoyo = programasApoyo;
        this.nivelComprensionLectora = nivelComprensionLectora;
    }

    public String getProgramasApoyo() {
        return programasApoyo;
    }

    public String getNivelComprensionLectora() {
        return nivelComprensionLectora;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               ", Programas de apoyo: " + programasApoyo +
               ", Nivel de comprensión lectora: " + nivelComprensionLectora;
    }

}


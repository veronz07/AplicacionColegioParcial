/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vero
 */
public class EstudianteTest {
     @Test
    public void testConstructorYToString() {
        // Arrange
        Estudiante estudiante = new Estudiante(
                "Laura", 
                "Calle 123", 
                "3001234567", 
                "2010-05-10", 
                1001, 
                8
        );

        // Assert (valida atributos)
        assertEquals("Laura", estudiante.nombre);
        assertEquals("Calle 123", estudiante.direccion);
        assertEquals("3001234567", estudiante.telefono);
        assertEquals("2010-05-10", estudiante.fechaNacimiento);
        assertEquals(1001, estudiante.codigo);
        assertEquals(8, estudiante.grado);

        // Verifica que toString contenga todos los datos
        String texto = estudiante.toString();
        assertTrue(texto.contains("Laura"));
        assertTrue(texto.contains("Calle 123"));
        assertTrue(texto.contains("1001"));
        assertTrue(texto.contains("8"));
    }

    @Test
    public void testHerenciaDePersona() {
        // Arrange
        Estudiante estudiante = new Estudiante(
                "Pedro", 
                "Cra 45", 
                "3119998888", 
                "2009-08-22", 
                2002, 
                9
        );

        // Assert
        assertTrue(estudiante instanceof Persona, 
                "Estudiante debe ser instancia de Persona");
    }
    
    
}

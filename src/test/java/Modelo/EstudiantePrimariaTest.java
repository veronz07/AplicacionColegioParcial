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
public class EstudiantePrimariaTest {
    @Test
    public void testConstructorYGetters() {
        // Arrange
        EstudiantePrimaria ep = new EstudiantePrimaria(
                "Carlos",
                "Calle 10 #20",
                "3154445555",
                "2013-09-20",
                3001,
                4,
                true,
                "Avanzado"
        );

        // Assert
        assertEquals("Carlos", ep.nombre);
        assertEquals("Calle 10 #20", ep.direccion);
        assertEquals("3154445555", ep.telefono);
        assertEquals("2013-09-20", ep.fechaNacimiento);
        assertEquals(3001, ep.codigo);
        assertEquals(4, ep.grado);
        assertTrue(ep.tieneProgramasApoyo());
        assertEquals("Avanzado", ep.getNivelComprensionLectora());
    }

    @Test
    public void testToStringIncluyeDatos() {
        // Arrange
        EstudiantePrimaria ep = new EstudiantePrimaria(
                "Lucía",
                "Carrera 7 #55",
                "3203334444",
                "2014-12-05",
                3002,
                2,
                false,
                "Medio"
        );

        // Act
        String texto = ep.toString();

        // Assert
        assertTrue(texto.contains("Lucía"));
        assertTrue(texto.contains("No")); // porque programasApoyo = false
        assertTrue(texto.contains("Medio"));
    }
}

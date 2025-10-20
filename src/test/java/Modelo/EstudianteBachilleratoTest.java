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
public class EstudianteBachilleratoTest {
     @Test
    public void testConstructorYGetters() {
        // Arrange
        EstudianteBachillerato eb = new EstudianteBachillerato(
                "Sofía", 
                "Av. Libertad 45", 
                "3105554444", 
                "2008-04-12", 
                2010, 
                10, 
                80.5, 
                "B2"
        );

        // Assert
        assertEquals("Sofía", eb.nombre);
        assertEquals("Av. Libertad 45", eb.direccion);
        assertEquals("3105554444", eb.telefono);
        assertEquals("2008-04-12", eb.fechaNacimiento);
        assertEquals(2010, eb.codigo);
        assertEquals(10, eb.grado);
        assertEquals(80.5, eb.getHorasServicioSocial());
        assertEquals("B2", eb.getNivelIngles());
    }

    @Test
    public void testToStringContieneDatos() {
        // Arrange
        EstudianteBachillerato eb = new EstudianteBachillerato(
                "Juan", 
                "Calle 9", 
                "3012221111", 
                "2009-03-02", 
                2020, 
                11, 
                100, 
                "C1"
        );

        // Act
        String texto = eb.toString();

        // Assert
        assertTrue(texto.contains("Juan"));
        assertTrue(texto.contains("C1"));
        assertTrue(texto.contains("100"));
    }
}

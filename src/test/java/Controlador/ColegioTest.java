/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Vero
 */

public class ColegioTest {
     private Colegio colegio;

    @BeforeEach
    public void setUp() {
        colegio = new Colegio();
    }

    @Test
    public void testAgregarProfesoresYVerificarOrdenPorPago() {
        // Arrange
        Profesor p1 = new Profesor("Ana", "Dir1", "Tel1", "1980-01-01", "123", "Matemáticas", 100, 10);
        Profesor p2 = new Profesor("Luis", "Dir2", "Tel2", "1975-05-05", "456", "Ciencias", 200, 10);
        Profesor p3 = new Profesor("Marta", "Dir3", "Tel3", "1985-03-10", "789", "Arte", 150, 10);

        colegio.getProfesores().add(p1);
        colegio.getProfesores().add(p2);
        colegio.getProfesores().add(p3);

        // Act: ordenar manualmente como lo hace el método del colegio
        ArrayList<Profesor> ordenados = new ArrayList<>(colegio.getProfesores());
        ordenados.sort((a, b) -> Double.compare(a.calcularPagoMensual(), b.calcularPagoMensual()));

        // Assert: el orden debe ser Ana (menor), Marta (medio), Luis (mayor)
        assertEquals("Ana", ordenados.get(0).nombre);
        assertEquals("Marta", ordenados.get(1).nombre);
        assertEquals("Luis", ordenados.get(2).nombre);
    }

    @Test
    public void testCalculoTotalPrestaciones() {
        // Arrange
        Profesor p1 = new Profesor("Ana", "Dir1", "Tel1", "1980-01-01", "123", "Matemáticas", 100, 10);
        Profesor p2 = new Profesor("Luis", "Dir2", "Tel2", "1975-05-05", "456", "Ciencias", 200, 10);

        colegio.getProfesores().add(p1);
        colegio.getProfesores().add(p2);

        // Act
        double totalCalculado = 0;
        for (Profesor p : colegio.getProfesores()) {
            totalCalculado += p.calcularPrestaciones();
        }

        // Assert: el total debe ser la suma de las prestaciones individuales
        double esperado = p1.calcularPrestaciones() + p2.calcularPrestaciones();
        assertEquals(esperado, totalCalculado, 0.0001);
    }

    @Test
    public void testAgregarYListarEstudiantes() {
        // Arrange
        EstudiantePrimaria ep = new EstudiantePrimaria("Carlos", "Dir1", "Tel", "2014-01-01",
                100, 3, true, "Medio");
        EstudianteBachillerato eb = new EstudianteBachillerato("Laura", "Dir2", "Tel", "2008-05-05",
                200, 9, 80, "B1");

        colegio.getEstudiantes().add(ep);
        colegio.getEstudiantes().add(eb);

        // Act
        ArrayList<Estudiante> lista = colegio.getEstudiantes();

        // Assert
        assertEquals(2, lista.size());
        assertTrue(lista.get(0) instanceof EstudiantePrimaria);
        assertTrue(lista.get(1) instanceof EstudianteBachillerato);
        assertEquals("Carlos", lista.get(0).nombre);
        assertEquals("Laura", lista.get(1).nombre);
    }

   
}
    
   
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
public class ProfesorTest {

    @Test
    public void testCalcularPagoMensual() {
        Profesor profesor = new Profesor("Laura", "Calle 10", "123456", "1985-05-20",
                                          "101010", "Matemáticas", 50000, 40);
        double esperado = 50000 * 40 * 1.2; // +20% por preparación
        assertEquals(esperado, profesor.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testCalcularPagoMensualSobrecargado() {
        Profesor profesor = new Profesor("Pedro", "Calle 20", "654321", "1980-04-10",
                                          "202020", "Lengua", 60000, 20);
        double esperado = 60000 * 20 * 1.15; // 15% bonificación
        assertEquals(esperado, profesor.calcularPagoMensual(15), 0.01);
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor profesor = new Profesor("Ana", "Cra 30", "987654", "1979-03-12",
                                          "303030", "Ciencias", 40000, 30);
        double pago = profesor.calcularPagoMensual();
        double esperadoPrestaciones = pago * 0.17;
        assertEquals(esperadoPrestaciones, profesor.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testToStringContieneDatosBasicos() {
        Profesor profesor = new Profesor("Mario", "Av. 50", "999999", "1975-02-01",
                                          "404040", "Historia", 45000, 25);
        String texto = profesor.toString();
        assertTrue(texto.contains("Mario"));
        assertTrue(texto.contains("Historia"));
        assertTrue(texto.contains("Pago mensual"));
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
import Controlador.Colegio;



/**
 *
 * @author Vero
 */
public class ProgramaColegio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Colegio colegio = new Colegio();
        
         int opcionPrincipal;

        do {
            // 🔹 Menú principal
            String menu = " MENÚ PRINCIPAL: \n"+
                    "1. Registrar persona \n"+
                    "2. Listar estudiantes \n"+
                    "3. Listar profesores (ordenados por pago)\n"+
                    "4. Salir\n";
                   

            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcionPrincipal) {
                case 1 -> {
                    // Submenú para registrar persona
                    int subOpcion;
                    do{
                        String subMenu = "REGISTRAR PERSONA \n"+ 
                            "1. Registrar profesor \n"+
                            "2. Registrar estudiante\n"+
                            "3. Volver al menú principal \n";

                        subOpcion = Integer.parseInt(JOptionPane.showInputDialog(subMenu));

                        switch (subOpcion) {
                            case 1 -> colegio.registrarProfesor();
                        
                            case 2 -> colegio.registrarEstudiante();
                        
                            case 3 -> JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                        
                            default -> JOptionPane.showMessageDialog(null, "️ Opción inválida.");
                        
                        }
                    }while(subOpcion!=3);
                }

                case 2 -> colegio.listarEstudiantes();
                case 3 -> colegio.listarProfesoresOrdenados();
                case 4 -> JOptionPane.showMessageDialog(null, " Programa finalizado.");
                default -> JOptionPane.showMessageDialog(null, "️ Opción inválida. Intente nuevamente.");
            }

        } while (opcionPrincipal != 4);
    }
}
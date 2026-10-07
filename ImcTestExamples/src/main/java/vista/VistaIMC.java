/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author USER
 */


public class VistaIMC {
    
    public void mostrarResultado(String tipoPersona, double imc, String diagnostico) {
        System.out.println("--- RESULTADO DEL ANÁLISIS ---");
        System.out.println("Perfil: " + tipoPersona);
        System.out.printf("IMC Calculado: %.2f\n", imc);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("------------------------------\n");
    }

    public void mostrarError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
}

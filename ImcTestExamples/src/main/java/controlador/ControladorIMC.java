/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author USER
 */


import modelo.Persona;
import vista.VistaIMC;

public class ControladorIMC {
    private VistaIMC vista;

    public ControladorIMC(VistaIMC vista) {
        this.vista = vista;
    }

    // Recibe un objeto Persona (aquí también se ve el polimorfismo, 
    // ya que puede recibir una Persona normal o un Deportista)
    public void evaluarPaciente(Persona paciente) {
        try {
            double imc = paciente.calcularIMC();
            String diagnostico = paciente.obtenerDiagnostico();
            
            // Determinamos qué tipo de clase es solo para imprimirlo en la vista
            String tipo = paciente.getClass().getSimpleName(); 
            
            vista.mostrarResultado(tipo, imc, diagnostico);
        } catch (Exception e) {
            vista.mostrarError("Ocurrió un error al procesar los datos.");
        }
    }
}

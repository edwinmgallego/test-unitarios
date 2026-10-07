/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imctestexamples;

/**
 *
 * @author USER
 */
import modelo.Persona;
import modelo.Deportista;
import vista.VistaIMC;
import controlador.ControladorIMC;
public class ImcTestExamples {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Inicializamos la Vista y el Controlador
        VistaIMC vista = new VistaIMC();
        ControladorIMC controlador = new ControladorIMC(vista);

        // 1. Creamos una Persona normal (ej. 75kg, 1.70m)
        Persona personaNormal = new Persona(75.0, 1.70);
        
        // 2. Creamos un Deportista (ej. Culturista de 85kg, 1.70m)
        Persona atleta = new Deportista(85.0, 1.70, "Halterofilia");

        // Ejecutamos la lógica a través del controlador
        controlador.evaluarPaciente(personaNormal);
        controlador.evaluarPaciente(atleta);
    }
}

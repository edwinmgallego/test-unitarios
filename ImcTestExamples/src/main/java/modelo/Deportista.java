/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */


public class Deportista extends Persona {
    private String deporte;

    public Deportista(double peso, double altura, String deporte) {
        super(peso, altura); // Llama al constructor de la clase padre
        this.deporte = deporte;
    }

    public String getDeporte() { return deporte; }
    public void setDeporte(String deporte) { this.deporte = deporte; }

    // POLIMORFISMO: Sobrescribimos el comportamiento del padre
    @Override
    public String obtenerDiagnostico() {
        double imc = calcularIMC();
        // Para un deportista, un IMC de "Sobrepeso" podría ser masa muscular
        if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso (Atención: Puede ser masa muscular debido a la práctica de " + deporte + ")";
        }
        // Si no cae en esa excepción, usamos el comportamiento original del padre
        return super.obtenerDiagnostico(); 
    }
}

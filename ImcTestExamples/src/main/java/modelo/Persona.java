/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */


public class Persona {
    protected double peso;   // en kilogramos
    protected double altura; // en metros

    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Método para calcular el valor numérico del IMC
    public double calcularIMC() {
        if (altura <= 0) return 0; // Evitar división por cero
        return peso / (altura * altura);
    }

    // Método que devuelve el diagnóstico (Será sobrescrito para demostrar polimorfismo)
    public String obtenerDiagnostico() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}

package org.academy.devdojo.maratonajava.javacore.intruducaometodos.test;

import org.academy.devdojo.maratonajava.javacore.intruducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoisNumeros(20,0);
        System.out.println(result);
    }
}

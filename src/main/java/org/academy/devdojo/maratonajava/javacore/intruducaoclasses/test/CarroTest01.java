package org.academy.devdojo.maratonajava.javacore.intruducaoclasses.test;

import org.academy.devdojo.maratonajava.javacore.intruducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "Hatch";
        carro1.ano = 2010;

        carro2.nome = "Corolla";
        carro2.modelo = "Sedan";
        carro2.ano = 2019;

        carro1 = carro2;

        System.out.println("Carro 1:"+ carro1.nome + "\nModelo:" + carro1.modelo + "\nAno:" + carro1.ano);
        System.out.println("\nCarro 2:"+ carro2.nome + "\nModelo:" + carro2.modelo + "\nAno:" + carro2.ano);
    }
}

package org.academy.devdojo.maratonajava.javacore.intruducaoclasses.test;

import org.academy.devdojo.maratonajava.javacore.intruducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
       Estudante estudante = new Estudante();
       Estudante estudante2 = new Estudante();

        estudante2.nome = "Guel";


        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);
    }
}

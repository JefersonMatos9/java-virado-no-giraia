package org.academy.devdojo.maratonajava.javacore.intruducaoclasses.test;

import org.academy.devdojo.maratonajava.javacore.intruducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Miguel";
        estudante.idade = 5;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}

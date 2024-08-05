package org.academy.devdojo.maratonajava.javacore.intruducaoclasses.test;

import org.academy.devdojo.maratonajava.javacore.intruducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Bruna";
        professor.idade = 30;
        professor.sexo = 'F';

        System.out.println("Nome:" + professor.nome + ",idade:" + professor.idade + ",sexo:" + professor.sexo);
    }
}

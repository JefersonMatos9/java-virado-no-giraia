package org.academy.devdojo.maratonajava.javacore.intruducaometodos.test;

import org.academy.devdojo.maratonajava.javacore.intruducaometodos.dominio.Estudante;
import org.academy.devdojo.maratonajava.javacore.intruducaometodos.dominio.ImpressoraEstudantes;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Goku";
        estudante01.idade = 35;
        estudante01.sexo = 'M';

        estudante02.nome = "Gohan";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}

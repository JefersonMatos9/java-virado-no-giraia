package org.academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
       int numero1 = 10;
       int numero2 = 20;
       double resultado = numero2/numero1;
        System.out.println("Valor " + resultado);

        // %
        int resto = 21 % 3;
        System.out.println(resto);

        // logicos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        System.out.println("isDezMaiorQueVinte:" +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte:" +isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte:" +isDezIgualAVinte);
        System.out.println("isDezIgualADez:" +isDezIgualADez);

        // && (AND) || (or) !

        int idade = 30;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4600;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoComparavel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        // = += -= *= /= %=
        double bonus = 1800;
         bonus += 1000;
         bonus -= 1000;
         bonus *= 2;
         bonus /= 2;
         bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador =0;
        contador +=1;
        contador++;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
    }
}

package org.academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario maior que 5000
        double salario = 10000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo.": "Ainda não tenho condições, mas vou ter.";
        // condição verdadeiro ou falso

        System.out.println(resultado);
    }
}

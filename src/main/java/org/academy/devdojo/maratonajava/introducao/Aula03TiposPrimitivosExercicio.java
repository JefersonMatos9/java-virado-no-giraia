package org.academy.devdojo.maratonajava.introducao;
/*
Pratica
Crie Variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Jeferson Matos";
        String endereco = "Av:Joaquim Vieira Nunes n° 642";
        double salario = 5500.00;
        String dataRecebimento = "05/07/2024";
        String relatorio = "Eu "+ nome + ",morando no endereço "+ endereco + ",confirmo que recebi o salário de " + salario + ",na data " + dataRecebimento;

        System.out.println(relatorio);

    }
}

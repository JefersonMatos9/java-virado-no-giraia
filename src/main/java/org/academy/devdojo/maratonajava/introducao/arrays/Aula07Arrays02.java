package org.academy.devdojo.maratonajava.introducao.arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short,int,long,float e double 0
        //char '\u0000' ''
        //boolean false
        // String null
        // são oque cada tipo vai imprimir se o array estiver vazio
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Goten";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}

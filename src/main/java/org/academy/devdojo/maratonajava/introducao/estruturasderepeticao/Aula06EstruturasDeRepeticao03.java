package org.academy.devdojo.maratonajava.introducao.estruturasderepeticao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os 25 primeiros numeros de um dado valor. Por exemplo 50
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i >= 25) {
                break;
            }
                System.out.println("i" + i);
        }
    }
}

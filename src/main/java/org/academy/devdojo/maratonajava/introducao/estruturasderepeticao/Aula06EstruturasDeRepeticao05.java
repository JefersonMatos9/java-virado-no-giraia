package org.academy.devdojo.maratonajava.introducao.estruturasderepeticao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado o valor de um carro,descubra em quantas ele pode ser parcelado
        // Condição valor da parcela >= 1000
            double valorTotal = 30000;
            for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
                double valorParcela = valorTotal/parcela;
                if (valorParcela > 1000 || valorParcela < 200){
                    continue;
                }
                System.out.println("Parcela " + parcela+ ",R$:" + valorParcela);
            }
    }
}

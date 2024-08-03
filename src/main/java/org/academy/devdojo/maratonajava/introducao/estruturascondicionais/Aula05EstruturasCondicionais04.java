package org.academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double impostoBaixo = 9.70/100;
        double impostoMedio = 37.35/100;
        double impostoAlto = 49.5/100;
        double valorDoImposto;
        if (salarioAnual <= 34713){
            valorDoImposto = salarioAnual * impostoBaixo;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorDoImposto = salarioAnual * impostoMedio;
        }else {
            valorDoImposto = salarioAnual * impostoAlto;
        }
        System.out.println("Total a pagar de imposto:" + valorDoImposto);
    }
}

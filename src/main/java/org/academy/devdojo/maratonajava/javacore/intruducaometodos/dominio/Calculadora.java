package org.academy.devdojo.maratonajava.javacore.intruducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(20 - 10);
    }
    public void multiplicaDoisNumeros(int num1,int num2){
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void alteraValores(int numero1,int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 "+numero1);
        System.out.println("Num2 "+numero2);
    }
}

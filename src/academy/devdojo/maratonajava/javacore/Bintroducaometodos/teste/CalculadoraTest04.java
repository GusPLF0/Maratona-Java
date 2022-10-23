package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        // Os números não serão alterados, pois passamos apenas uma cópia!
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("NumUm" + num1);
        System.out.println("NumDois" + num2);


    }
}

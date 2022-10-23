package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();

        System.out.println(calc1.sum(1,2));
        System.out.println(calc2.sum(1,2));

    }
}

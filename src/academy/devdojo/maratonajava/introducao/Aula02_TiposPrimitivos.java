package academy.devdojo.maratonajava.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int camelCase; // --> Padrão de nomenclatura de variável

        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        // String não é um tipo primitivo, String é uma classe

        String nome = "Naruto Uchiha";
        
        System.out.println("O nome do Naruto é: " + nome);

        System.out.println(idade);
    }
}

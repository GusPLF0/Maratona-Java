package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos: +, -, /, *, %
        /*

        + se comporta de 2 maneiras:

        Se tiver String antes do sinal de + = Concatenação

        Se tiver Int antes do sinal de + = Adição

         */

        int numero01 = 10;
        int numero02 = 20;
        int resultado1 = 10 + 20;
        int resultado2 = 20 - 10;
        int resultado3 = 20 * 10;


        // O resultado de uma operação com dois números inteiros gera um número inteiro
        int resultado4 = 20/10;


        System.out.println(numero02 + numero01);

        // Operadores relacionais: <, >, <=, >=, ==, !=


        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezIgualAVinte = 10 == 20;


        System.out.printf("Is? %b \n ", isDezMaiorVinte);
        System.out.printf("Is? %b \n ", isDezMenorVinte);
        System.out.printf("Is? %b \n ", isDezMenorIgualQueVinte);
        System.out.printf("Is? %b \n ", isDezMaiorIgualQueVinte);
        System.out.printf("Is? %b \n ", isDezDiferenteVinte);
        System.out.printf("Is? %b \n ", isDezIgualAVinte);


        // Operadores Lógicos: && (AND), || (OR), ! (NOT)
        int idade = 35;
        float salario = 2500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        float valorContaCorrente = 200F;
        float valorContaPoupanca = 10000F;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorContaCorrente >= valorPlaystation || valorContaPoupanca >= valorPlaystation;


        // Operadores de atribuição: =, +=, -=, *=, /=, %=

        double bonus = 1800;
        bonus += 1000;
        bonus /= 2;
        bonus *= 2;
        bonus -= 1000;

        // Operadores incrementais: ++ --

        int i = 0;

        i++; // -> Primeiro faz oq tem que fazer, depois incrementa
        ++i; // -> Primeiro incrementa, depois faz oq tem que fazer
    }
}

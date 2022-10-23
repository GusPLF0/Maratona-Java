package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

// Metodo = modificador de acesso + tipo do retorno + nome + parametros (uma função)
public class Calculadora {


    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }


    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }

    // Método com paramêtro
    public void multiplicaDoisNumeros(int numeroUm, int numeroDois){
        System.out.println(numeroUm * numeroDois);
    }

    public static double divideDoisNumeros(double numeroUm, double numeroDois){
        return numeroUm/numeroDois;
    }

    public static void alteraDoisNumeros(int numeroUm, int numeroDois){
        numeroUm = 99;
        numeroDois = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("NumUm" + numeroUm);
        System.out.println("NumDois" + numeroDois);
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for (int num:
             numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    // Sintaxe para simplificar passagem de arrays
    // Única coisa que muda é a chamada do método
    // VarArgs precisa ser o último!
    public static void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num:
                numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

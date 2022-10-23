package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 adulto

        // Variáveis locais precisam ser inicializadas, se não dá merda.

        int idade = 17;

        if (idade < 15) {
            System.out.println("Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }
}

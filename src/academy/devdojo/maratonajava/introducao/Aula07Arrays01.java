package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Sintaxe de array: tipo[] nome = new tipo[tamanho]
        // Se não inicializar a variável(que é do tipo reference)
        // ela não vai apontar para lugar nenhum

        int[] idade = new int[3];
        idade[0] = 20;
        idade[1] = 15;
        idade[2] = 11;
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
    }
}

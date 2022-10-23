package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        byte count = 0;

        for (int i = 1; i < valorCarro; i++) {
            if(valorCarro/i < 1000){
                break;
            }
            System.out.println("Você pode parcelar seu carro em " + i + " Vezes, no valor de : " + valorCarro/i);
        }


    }
}

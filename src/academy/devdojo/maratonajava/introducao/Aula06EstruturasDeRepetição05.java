package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        byte count = 0;

        for (int i = (int) valorCarro; i >= 1; i--) {
            if(valorCarro/i < 1000){
                continue;
            }
            System.out.println("Você pode parcelar seu carro em " + i + " Vezes, no valor de : " + valorCarro/i);
        }


    }
}

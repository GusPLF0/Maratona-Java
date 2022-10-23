package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
       // Formas diferentes de inicializar arrays
        int[] numero = {1, 2, 3};
        int[] numero2 = new int[]{1,2,3};


        // For each
        for (int num : numero){
            System.out.println(num);
        }
    }
}

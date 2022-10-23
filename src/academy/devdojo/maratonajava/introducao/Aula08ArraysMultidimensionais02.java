package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        // Estamos fazendo as posições de arrayInt >>apontar<< para outros arrays

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[5];
        arrayInt[2] = new int[6];

        // Outra forma de inicializar o array

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}

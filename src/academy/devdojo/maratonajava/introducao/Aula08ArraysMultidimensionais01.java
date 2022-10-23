package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // Um array com dois espaços que apontam para outros arrays
        //   [  [-]      ,     [-]    ] <-- 1 Array, 2 Posições
        //       |              |
        //     [0, 1]         [1, 2] <-- 2 Arrays de 2 Posições cada
        int[][] dias = new int[2][2];

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // For each com arrays multidimensionais
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}

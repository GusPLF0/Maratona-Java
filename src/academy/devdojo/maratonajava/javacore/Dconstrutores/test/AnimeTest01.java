package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Shonen", 300, 12); // 1° Construtor
        Anime anime2 = new Anime(); // 2° Construtor

        anime.imprime();

    }
}

package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Ronaldinho");

        Jogador[] arrayJogador = {jogador1, jogador2, jogador3};

        for (Jogador jogador:
             arrayJogador) {
            jogador.imprime();
        }
    }
}

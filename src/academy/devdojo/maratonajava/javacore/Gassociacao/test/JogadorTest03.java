package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Mané Garrincha");
        Jogador jogador2 = new Jogador("Nilton Santos");
        Jogador jogador3 = new Jogador("Jefferson");

        Time time1 = new Time("Botafogo", new Jogador[]{jogador1, jogador2, jogador3});

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);

        time1.imprimir();
        System.out.println("---------------------------");
        jogador1.imprime();
        System.out.println(" ");
        jogador2.imprime();
        System.out.println(" ");
        jogador3.imprime();

    }
}

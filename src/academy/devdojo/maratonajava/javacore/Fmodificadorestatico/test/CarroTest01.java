package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BWM", 280);
        Carro carro2 = new Carro("BWM", 280);
        Carro carro3 = new Carro("BWM", 280);


        // Todos os objetos carros vão ter velocidadeLimite = 180
        // Você básicamente altera a classe
        Carro.setVelocidadeLimite(180);


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}

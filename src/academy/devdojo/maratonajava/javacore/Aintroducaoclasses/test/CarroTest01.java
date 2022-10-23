package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Ferrari";
        carro1.ano = 2022;
        carro1.nome = "Ferrari V3";

        carro2.modelo = "Porshe";
        carro2.ano = 2022;
        carro2.nome = "Porshe V3";

        // O valor que carro1 apontava se perde!
        carro1 = carro2;

        System.out.println("Modelo: " + carro1.modelo + "\nAno: " + carro1.ano + "\nNome: " + carro1.nome + "\n");
        System.out.println("Modelo: " + carro2.modelo + "\nAno: " + carro2.ano + "\nNome: " + carro2.nome);
    }
}

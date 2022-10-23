package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        // Objetos que não tem seus atributos inicializados tem seu valor padrão de inicialização
        // Ou o valor que foi definido na classe!
        Estudante estudante = new Estudante();

        System.out.println(estudante.nome);
    }
}

package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // estudante é uma variável do tipo referência(ponteiro)
        // que aponta para um new Estudante(onde realmente fica as características)
        Estudante estudante = new Estudante();
        estudante.nome = "Goku";
        estudante.idade = 50;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}

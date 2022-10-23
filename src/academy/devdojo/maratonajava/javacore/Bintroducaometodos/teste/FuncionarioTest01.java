package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Gustavo Pedro");
        funcionario.setIdade(18);
        funcionario.setSalarios (new double[]{1200, 987.32, 2000});


        funcionario.imprimir();

        System.out.println("\nMédia salarial: \n" + funcionario.media());


    }
}

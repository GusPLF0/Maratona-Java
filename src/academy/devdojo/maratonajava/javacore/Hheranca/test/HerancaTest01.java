package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01{
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Laranjeiras");
        endereco.setCep("123123231-44");

        Pessoa pessoa = new Pessoa("Goku");

        pessoa.setNome("Goku");
        pessoa.setCpf("05512312344");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Oda", 20000);

        funcionario.setCpf("23408283");
        funcionario.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("+++++++++++++++");
        funcionario.imprime();
    }
}

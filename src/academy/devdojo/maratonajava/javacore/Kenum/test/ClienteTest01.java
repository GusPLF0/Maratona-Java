package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_FISICA;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_JURIDICA;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento.CREDITO;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Goku", PESSOA_FISICA, DEBITO);
        Cliente cliente2 = new Cliente("Gogeta", PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}

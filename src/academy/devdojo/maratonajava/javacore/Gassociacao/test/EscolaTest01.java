package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya");
        Professor professor02 = new Professor("Gojo");
        Professor professor03 = new Professor("Kakashi");

        Escola escola = new Escola("Escola jujutsu", new Professor[]{professor01, professor02, professor03});
        escola.imprime();
    }
}

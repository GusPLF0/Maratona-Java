package academy.devdojo.maratonajava.javacore.Gassociacao.sistema.main;

import academy.devdojo.maratonajava.javacore.Gassociacao.sistema.classes.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.sistema.classes.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.sistema.classes.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.sistema.classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Goku", 200);
        Professor professor = new Professor("Shanks", "Pirata");
        Seminario seminario = new Seminario("Como se tornar um pirata", new Aluno[]{aluno}, local);

        professor.setSeminarios(new Seminario[]{seminario});
    }
}

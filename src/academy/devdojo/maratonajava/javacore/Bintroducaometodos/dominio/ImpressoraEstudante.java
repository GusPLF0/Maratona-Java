package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    // Diferente de passar um tipo primitivo em um metodo
    // Quando você passa um tipo referência as alterações são persistidas no objeto(nesse caso, estudante)
    public void imprime(Estudante estudante){
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    // Estamos fazendo o encapsulamento e garantindo um baixo acoplamento
    // Acoplamento = Quanto uma classe sabe da outra?
    // Encapsulamento = Esconder detalhes sensiveis, basta alterar o modificador de acesso
    // Modificadores = public, private, protected
    // Atributos private só podem ser acessados pelo objeto

    // alto ACOPLAMENTO = RUIM
    // alta COESÃO = BOM
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Inválido");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

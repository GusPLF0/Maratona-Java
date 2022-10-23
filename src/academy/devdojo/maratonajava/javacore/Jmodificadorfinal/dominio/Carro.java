package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;
// Quando você coloca uma classe do tipo final você não consegue fazer ela ser extendida
public class Carro {
    private String nome;
    // Constante = static final!
    public static final double VELOCIDADE_LIMITE = 250;

    // Quando variáveis do tipo reference são final você não pode alterar a referência
    // Mas, pode alterar os valores daquela referencia
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

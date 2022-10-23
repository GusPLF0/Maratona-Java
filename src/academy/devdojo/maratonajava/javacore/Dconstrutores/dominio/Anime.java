package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private int idade;
    private String estudio;

    // Construtor
    public Anime(String nome, String tipo, int episodios, int idade) {
        this(); // Tem que ser a primeira linha do construtor!
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.idade = idade;
    }

    // Sobrecarga de Construtores
    public Anime() {
    }

    public Anime(String nome, String tipo, int episodios, int idade, String estudio) {
        this(nome, tipo, episodios, idade); // Só pode ser usado dentro de construtores!
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println(tipo);
        System.out.println(episodios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

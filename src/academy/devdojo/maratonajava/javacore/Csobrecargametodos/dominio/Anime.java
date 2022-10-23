package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private int idade;

    // Sobrecarga de métodos!

    // Podemos criar dois métodos com um mesmo nome, mas que possuem alguma pequena diferença entre eles nos paramêtros!

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public void init(String nome, String tipo, int episodios, int idade){
        this.init(nome, tipo, episodios);
        this.idade = idade;
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

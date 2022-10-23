package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // Bloco de inicialização não estático, sempre executado quando um objeto é instanciado (antes dos construtor)

    // 1 - Alocação de espaço na memória
    // 2- Atributos da classe são criados e inicializados
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i++;
        }
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        System.out.println();
    }
}

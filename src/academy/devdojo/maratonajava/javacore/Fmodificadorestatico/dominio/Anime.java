package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    // Se precisamos que todos os animes tenham a mesma quantidade de episódios, vamos setar o atributo episódios como estático
    private static int[] episodios;

    // Ordem de execução do Java:
    // 0 - Blocos estáticos são inicializados (Podem sem blocos de inicialização)
    // 1-  Alocação de memória (objeto)
    // 2-  Atributos são inicializados
    // 3-  Blocos de inicialização normais são executados
    // 4-  Construtor


    // Definindo o bloco de inicialização como estático, assim, ele será executado apenas uma vez!
    static {
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

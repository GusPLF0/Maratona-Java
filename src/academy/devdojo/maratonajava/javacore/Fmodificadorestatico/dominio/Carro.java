package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // Modificador de acesso static faz com que o atributo pertença a todos os objetos!
    // Ou seja, esse atributos agora pertence a classe!
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // This não existe em metodos estaticos!
    // Isso é óbvio, já que pode-se ter situações onde temos uma chamada para a classe sem ter um objeto
    public void imprime(){

        System.out.println("---------");
        System.out.println(nome);
        System.out.println(velocidadeMaxima);
        System.out.println(Carro.velocidadeLimite);
    }

    // É recomendado usar um metodo estático apenas quando ele não acessa variáveis não estáticas(variáveis das instâncias)
    public static void setVelocidadeLimite(double velocidadeLimite){
        // Precisamos colocar o Carro.velocidadeLimite, já que: static = é da classe, não do objeto!
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}

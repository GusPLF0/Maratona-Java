package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;


    public void imprimir(){
        if ( salarios == null){
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario:
             salarios) {
            System.out.printf(salario + " ");
        }
    }

    public double media () {
        if ( salarios == null){
            return 0;
        }

        for (double salario:
             salarios) {
            media += salario;
        }
        return media/salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    // Alguns atributos não precisam ter o set, como é o exemplo do atributos média aqui!


}

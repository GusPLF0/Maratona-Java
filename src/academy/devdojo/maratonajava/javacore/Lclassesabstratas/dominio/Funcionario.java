package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

// Classes abstratas não podem ser instanciadas
// Não podemos ter apenas um funcionario, temos que especificar que tipo de funcionario ele é
// Classes abstratas são criadas apenas para ser uma superclasse
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    // Um grande poder das classes abstratas são os métodos abstratos
    // Métodos abstatos forçam as subclasses a implementa-lo
    // ‘Abstract’ não possuem corpo
    public abstract void calculaBonus();
}

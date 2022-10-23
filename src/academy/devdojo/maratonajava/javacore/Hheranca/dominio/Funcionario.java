package academy.devdojo.maratonajava.javacore.Hheranca.dominio;


// Funcionario é uma pessoa = Herança
// Funcionario tem tudo que uma pessoa tem
public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario");
    }

    // Se Funcionario é uma Pessoa, ele precisa definir tudo que a classe Pessoa define por meio de seu construtor!

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    // Super = se refere a classe pai
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu: " + this.nome + " recebi o valor de: " + this.salario);
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

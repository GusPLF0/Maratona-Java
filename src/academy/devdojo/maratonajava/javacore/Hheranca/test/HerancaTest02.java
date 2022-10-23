package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya", 55000);

        // 1° - Bloco de inicialização estáticos do pai é executado
        // 2° - Bloco de inicialização estáticos do filho
        // 3° - Alocado espaço em memória pro objeto da classe pai
        // 4° - Cada atributo da classe pai é criado e inicializado com valores default ou oq for passado na classe pai
        // 5° - Bloco de inicialização do pai é executado
        // 6° - Construtor do pai é executado
        // 7° - Alocado espaço em memória pro objeto da classe filha
        // 8° - Cada atributo da classe filha é criado e inicializado com valores default ou oq for passado na classe filha
        // 9° - Bloco de inicialização do filho é executado
        // 10° - Construtor do filho é executado
    }
}

package academy.devdojo.maratonajava.javacore.Minterface.dominio;

// Em ‘interfaces’ todos os métodos são como padrão publicos e abstratos
// Interfaces são contratos!
// Todos os atributos criados em uma interface são por padrão public static final
public interface DataLoader {
    void load();

    // Podemos criar metodos concretos em ‘interfaces’ para não precisar reescrever um método
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}

package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }
}

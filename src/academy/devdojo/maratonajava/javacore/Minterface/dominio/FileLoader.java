package academy.devdojo.maratonajava.javacore.Minterface.dominio;

// Uma classe pode implementar mais de uma interace
public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do Arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Arquivo...");
    }
}

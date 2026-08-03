package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissao no banco de dados");
    }

    // Nao tem sobreescrita
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe");
    }
}

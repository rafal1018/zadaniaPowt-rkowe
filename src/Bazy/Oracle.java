package Bazy;

public class Oracle implements Database {

    private String oracle;

    @Override
    public void save() {
        System.out.println("Zapisuje dane do bazy danych Oracle");
    }
}

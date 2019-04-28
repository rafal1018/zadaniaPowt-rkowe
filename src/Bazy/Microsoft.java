package Bazy;

public class Microsoft implements Database {

    private String microsoft;

    @Override
    public void save() {
        System.out.println("Zapisuje dane do bazy danych Microsoft");
    }
}

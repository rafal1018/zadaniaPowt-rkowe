package Alcohols;

public interface Alco {

    void calculatePerMil(double quantity, double weight, boolean male);

    void fillAlcohol(String name, double quantity, double volt);

    void printAlcoholDTOToString();
}

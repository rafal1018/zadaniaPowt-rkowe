package Alcohols;

public class AlcoImpl implements Alco{

    private AlcoholDTO alcoholDTO = new AlcoholDTO();

    @Override
    public void calculatePerMil(double quantity, double weight, boolean male) {

        double P = 0;

        if (male == true){

            P = (0.8*quantity*alcoholDTO.getVolt())/(0.7*weight)/1000;

            System.out.print("Man (" + weight + ") will have ");
            System.out.format("%.3f%n", P);
            System.out.print(" promile " + "blood-alcohol content after drinking " + alcoholDTO.getQuantity()
            + "ml of " + alcoholDTO.getName() + ".");
        }
        else{
            P = (0.8*quantity*alcoholDTO.getVolt())/(0.6*weight);
            System.out.print("Woman (" + weight + ") will have ");
            System.out.format("%.3f%n", P);
            System.out.println(" promile " + "blood-alcohol content after drinking " + alcoholDTO.getQuantity()
                    + "ml of " + alcoholDTO.getName() + ".");
        }
    }

    @Override
    public void fillAlcohol(String name, double quantity, double volt) {

        alcoholDTO.setName(name);
        alcoholDTO.setQuantity(quantity);
        alcoholDTO.setVolt(volt);
    }

    @Override
    public void printAlcoholDTOToString() {

        System.out.println(alcoholDTO.toString());
    }
}
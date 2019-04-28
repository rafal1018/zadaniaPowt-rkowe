package Alcohols;

public class AlcoholDTO {

    private String name;
    private double quantity;
    private double volt;

    public AlcoholDTO() {}

    public AlcoholDTO(String name, double quantity, double volt) {
        this.name = name;
        this.quantity = quantity;
        this.volt = volt;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AlcoholDTO{" +
                "name ='" + name + '\'' +
                " quantity =" + quantity +
                '}';
    }
}

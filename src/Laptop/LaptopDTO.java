package Laptop;

public class LaptopDTO {
    private String name;
    private int rate;

    public LaptopDTO() {
    }

    public LaptopDTO(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "LaptopDTO{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}

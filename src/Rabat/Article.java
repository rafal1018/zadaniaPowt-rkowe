package Rabat;

public class Article {
    private String name;
    private double price;
    private double margin;

    public Article(String name, double price, double margin) {
        this.name = name;
        this.price = price;
        this.margin = margin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", margin=" + margin +
                '}';
    }
}

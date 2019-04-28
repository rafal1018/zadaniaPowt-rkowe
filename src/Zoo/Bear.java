package Zoo;

public class Bear extends Animal{

    private int furlength;

    public Bear(int id, String name, float weight, int furlength) {
        super(id, name, weight);
        this.furlength = furlength;
    }

    public int getFurlength() {
        return furlength;
    }

    public void setFurlength(int furlength) {
        this.furlength = furlength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm bear. My name is " + getName() + ". "
        + "I weigth " + getWeight() + " and my fur length " + getFurlength());
    }
}

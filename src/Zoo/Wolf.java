package Zoo;

public class Wolf extends Animal implements Canine{

    private int fagLength;

    public Wolf(int id, String name, float weight, int nagLength) {
        super(id, name, weight);
        this.fagLength = nagLength;
    }

    public int getNagLength() {
        return fagLength;
    }

    public void setNagLength(int nagLength) {
        this.fagLength = nagLength;
    }

    @Override
    public void introduce() {
        System.out.println(" I'm wolf. My name is " + getName() + "." + " I weigh " + getWeight()
        + " and my fang lenth is " + getNagLength());
    }

    @Override
    public void bark() {
        System.out.println("My name is " + getName() + " and I'm barking: BARK BARK BARK");
    }

}

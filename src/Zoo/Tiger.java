package Zoo;

public class Tiger extends Animal {

    private int clawlength;

    public Tiger(int id, String name, float weight, int clawlength) {
        super(id, name, weight);
        this.clawlength = clawlength;
    }

    public int getClawlength() {
        return clawlength;
    }

    public void setClawlength(int clawlength) {
        this.clawlength = clawlength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm tiger. My name is " + getName() + " I weigh " + getWeight()
                + " and my claw length is " + getClawlength());
    }
}

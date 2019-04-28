package Zoo;

public class Dog extends Animal implements Canine {

    public Dog(int id, String name, float weight) {
        super(id, name, weight);
    }



    public void sitPretty(){
        System.out.println(getName() + " sits pretty.");
    }

    @Override
    public void introduce() {
        System.out.println("I'm a dog. My name is " + getName() + " I weigh " + getWeight());
    }

    @Override
    public void bark() {
        System.out.println("My name is " + getName() + " and I'm barking: bark bark bark");
    }
}

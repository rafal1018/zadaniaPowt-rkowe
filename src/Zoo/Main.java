package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bear bear1 = new Bear(1, "Yogi", 200, 40);
        Tiger tiger1 = new Tiger(2,"Jataka", 150, 25);
        Wolf wolf1 = new Wolf(3, "Howler", 70, 40);
        Dog dog1 = new Dog(4, "Scooby", 30);

        List<Animal> animals = new ArrayList<>();

        animals.add(bear1);
        animals.add(tiger1);
        animals.add(wolf1);
        animals.add(dog1);

        for (Animal a: animals){
            a.introduce();
            System.out.println("id " + a.getId());
        }

        List<Canine> howlers = new ArrayList<>();

        howlers.add(dog1);
        howlers.add(wolf1);

        for (Canine c : howlers){
            c.bark();
        }
        dog1.sitPretty();

    }
}

package Alcohols;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AlcoImpl alcoholImpl1 = new AlcoImpl();
        alcoholImpl1.fillAlcohol("Beer",100, 5);

        AlcoImpl alcoholImpl2 = new AlcoImpl();
        alcoholImpl2.fillAlcohol("Vodka",100, 40);

        AlcoImpl alcoholImpl3 = new AlcoImpl();
        alcoholImpl3.fillAlcohol("Wine",100, 14);

        AlcoImpl alcoholImpl4 = new AlcoImpl();
        alcoholImpl4.fillAlcohol("Hooch",100, 60);

        List<AlcoImpl> list1 = new ArrayList<>();
        list1.add(alcoholImpl1);
        list1.add(alcoholImpl2);
        list1.add(alcoholImpl3);
        list1.add(alcoholImpl4);

        for (AlcoImpl a : list1){

            a.calculatePerMil(100, 80, false);
        }
    }
}

package Laptop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LaptopImpl laptop1 = new LaptopImpl();
        LaptopImpl laptop2 = new LaptopImpl();
        LaptopImpl laptop3 = new LaptopImpl();
        LaptopImpl laptop4 = new LaptopImpl();

        laptop1.setLaptopDTO("LENOVO Z580Q", 45);
        laptop2.setLaptopDTO("DELL LATITUDE", 35);
        laptop3.setLaptopDTO("ASUS NOVAGO", 15);
        laptop4.setLaptopDTO("ALIEWARE", 9);

        List<LaptopImpl> list = new ArrayList<>();
        list.add(laptop1);
        list.add(laptop2);
        list.add(laptop3);
        list.add(laptop4);

        for (LaptopImpl l : list){
            l.introduce();
        }

        for (LaptopImpl l : list){
            if (l.getRate() > 20){
                System.out.println(l.getName() + " is rated " + l.getRate());
            }
        }
    }
}

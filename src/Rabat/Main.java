package Rabat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Article article1 = new Article("Shower Gel", 3, 0.6);
        Article article2 = new Article("Board Game", 20, 1.3);
        Article article3 = new Article("Strawberries", 10, 0.5);

        List<Article> shoppingList = new ArrayList<>();

        shoppingList.add(article1);
        shoppingList.add(article2);
        shoppingList.add(article3);

        double[] discounts = new double[5];
        discounts[0] = 0;
        discounts[1] = 0;
        discounts[2] = 9.1;
        discounts[3] = 0.15;
        discounts[4] = 0.25;

        for (Article a : shoppingList){
            System.out.println(a);
        }

        double x = 0;

        for (Article a : shoppingList){

            x = x + a.getMargin()*a.getPrice();
        }

        System.out.println(x);

        for (int i = 0; i < discounts.length; i++) {

            if (discounts[i] == 0){
                System.out.println("Articles' price after 0,00% discount: " + x);
            }
            else {
                System.out.println("Articles' price after " + discounts[i] + "%"+ " discount: " + x*discounts[i]);
            }
        }
    }
}

package Wojna;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(createDeck());

        RatityBattle ratityBattle = new RatityBattle();

    }

    private static Deck createDeck(){
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Card card = createRandomCard();
            cards.add(card);
        }

        Deck deck = new Deck(cards);
        return deck;
    }

    private static  Card createRandomCard (){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        System.out.println(randomNumber);

        int randomColourNumber = random.nextInt(4);
        CardColour cardColour = CardColour.values()[2];

        boolean isRare = random.nextBoolean();
        Card card = new Card(cardColour, randomColourNumber, isRare);
        System.out.println("Wylosowana karta: " + card);

        return card;
    }

    public static void printWinner(int number){
        if (number > 0){
            System.out.println("Zwyciężyła talia numer 1");
        }

        else if (number < 0){
            System.out.println("Zwyciężyła talia numer 2");
        }

        else {
            System.out.println("Remis");
        }
    }

}

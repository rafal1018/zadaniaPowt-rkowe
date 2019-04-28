package Wojna;

public class RatityBattle implements Battle {

    public int checkWinner1(Deck deck, Deck secondDeck){
        int sumOfcolorNumbersinDeck1 = calculateColorValues(deck);
        int sumOfcolorNumbersinDeck2 = calculateColorValues(deck);

        if (sumOfcolorNumbersinDeck1 > sumOfcolorNumbersinDeck2){
            return 1;
        }

        else if (sumOfcolorNumbersinDeck1 < sumOfcolorNumbersinDeck2){
            return  -1;
        }
        else {
            return  0;
        }
    }


    private static int calculateColorValues(Deck deck){
        int sum = 0;
        for (Card card : deck.getCards()){
            sum += card.getColour().getValue();
        }

        return sum;
    }


    @Override
    public int checkWinner(Deck deck, Deck secondDeck){

        RatityBattle ratityBattle = new RatityBattle();
        int numbeOfRareCardsInDeckOne = ratityBattle.calculateRareCardNumber(deck);
        int numbeOfRareCardsInDeckTwo = ratityBattle.calculateRareCardNumber(secondDeck);

        if (numbeOfRareCardsInDeckOne > numbeOfRareCardsInDeckTwo){
            System.out.println("Zwyciężyła talia numer 1");
            System.out.println("Liczba kart rzadkich " + numbeOfRareCardsInDeckOne);
            return 1;
        }

        else if (numbeOfRareCardsInDeckOne < numbeOfRareCardsInDeckTwo){
            System.out.println("Zwyciężyła talia numer 2");
            System.out.println("Liczba kart rzadkich " + numbeOfRareCardsInDeckTwo);
            return 2;
        }

        else {
            System.out.println("Remis");
            System.out.println("Liczba kart rzadkich talii 1 " + numbeOfRareCardsInDeckOne);
            System.out.println("liczba kart rzadkich talii 2 +" + numbeOfRareCardsInDeckTwo);
            return 0;
        }
    }

    private int calculateRareCardNumber(Deck deck){

        int counter = 0;

        for (Card card : deck.getCards()){
            if (card.isRare()){
                counter ++;
            }
        }

        return counter;
    }
}

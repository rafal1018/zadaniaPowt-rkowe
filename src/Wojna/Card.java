package Wojna;

public class Card {

    private CardColour colour;
    private int value;
    private boolean rare;

    public Card(CardColour colour, int value, boolean rare) {
        this.colour = colour;
        this.value = value;
        this.rare = rare;
    }

    public CardColour getColour() {
        return colour;
    }

    public void setColour(CardColour colour) {
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "Card{" +
                "colour=" + colour +
                ", values=" + value +
                ", rare=" + rare +
                '}';
    }
}

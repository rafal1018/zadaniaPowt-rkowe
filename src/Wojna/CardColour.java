package Wojna;

public enum CardColour {

    Clubs(1),
    Diamond(2),
    Hearts(3),
    Spades(4);

    private int value;

    CardColour(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

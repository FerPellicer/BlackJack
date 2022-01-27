package card;


public abstract class Card {
    private final int value;
    
    public Card(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public abstract String toString();
    
    @Override
    public abstract boolean equals(Object c);
    
}
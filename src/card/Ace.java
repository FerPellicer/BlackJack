package card;
public class Ace extends Card {
    private final int otherValue = 1;

    public Ace() {
        super(11);
    }
    public int getOtherValue(){
        return this.otherValue;
    }
    
    @Override
    public String toString() {
        return "A";
    }
    
    @Override
    public boolean equals(Object c){
        return(c instanceof Ace);
    }   
}
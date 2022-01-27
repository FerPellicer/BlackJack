package card;

public class Figure extends Card{
    
    private final String figure;

    public Figure(String letter) {
        super(10);
        this.figure = letter;
    }
    
    public String getName() {
        return this.figure;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
    @Override
    public boolean equals(Object c){
        if(c instanceof Figure){
            Figure f = (Figure) c;
            return(f.getName().equals(getName()));
        }
        return false;
    }    
}
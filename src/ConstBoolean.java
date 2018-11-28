/**
 * Η παρακάτω abstract κλάση αναπαριστά μια λογική σταθερά.
 * This abstract class represents a logical constant.
 */
public abstract class ConstBoolean implements Expression {
    private boolean value;
    
    public ConstBoolean(boolean value) {
        this.value = value;
    }
    
    @Override
    public boolean evaluate() {
        return value;
    }
}

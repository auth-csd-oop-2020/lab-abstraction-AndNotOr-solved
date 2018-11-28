/**
 * Ο μοναδιαίος τελεστής ΝΟΤ. The unitary operator NOT.
 */
public class NOT implements Expression {
    private Expression operand;
    
    public NOT(Expression operand) {
        this.operand = operand;
    }
    
    @Override
    public boolean evaluate() {
        return !operand.evaluate();
    }
    
}

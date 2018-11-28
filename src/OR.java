/**
 * Ο δυαδικός λογικός τελεστής OR. The binary logical operator OR.
 */
public class OR extends BinaryOperator {
    
    public OR(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }
}

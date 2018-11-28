/**
 * Ο δυαδικός λογικός τελεστής AND. The binary logical operator AND
 */
public class AND extends BinaryOperator {
    
    public AND(Expression left, Expression right) {
        super(left, right);
    }

    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }
}

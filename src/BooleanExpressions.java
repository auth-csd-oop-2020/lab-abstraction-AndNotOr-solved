
import java.util.ArrayList;

/**
 * Η κλάση αυτή αποθηκεύσει λογικές παραστάσεις σε ένα arraylist.
 * This class saves logical expression in an arraylist.
 */
public class BooleanExpressions {
    private ArrayList<Expression> expressions;
    
    public BooleanExpressions() {
        expressions = new ArrayList<Expression>();
    }

    /**
     * Μέθοδος που προσθέτει μια νέα παράσταση.
     * This methods a new expression.
     * @param e Μια παράσταση, an expression
     */
    public void addExpression(Expression e) {
        expressions.add(e);
    }

    /**
     * Η μέθοδος αυτή επιστρέφει τον αριθμό των αληθών παραστάσεων.
     * This method returns the number of True expressions.
     * @return
     */
    public int howManyAreTrue() {
        int counter = 0;
        for (Expression e : expressions) {
            if (e.evaluate())
                counter++;
        }
        return counter;
    }
}

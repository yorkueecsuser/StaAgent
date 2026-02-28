import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Introduced an unreachable while loop as per the mutation operator requirements
    private boolean getCondition() {
        return false;
    }

    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }
    }
}
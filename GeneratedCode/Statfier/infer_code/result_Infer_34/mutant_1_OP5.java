import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Adding an unreachable switch statement
    public void someMethod() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is reachable if condition is true
                break;
            default:
                // This default case is reachable if condition is false
                break;
        }

        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                // This case is unreachable because getUnreachableCondition() always returns 0
                System.out.println("This is unreachable");
                break;
            case 2:
                // This case is also unreachable
                System.out.println("This is also unreachable");
                break;
        }
    }

    // Method to simulate a condition that is always false for the unreachable switch
    private int getUnreachableCondition() {
        return 0; // This ensures the switch statement is always unreachable
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return true; // This can be true or false based on runtime logic
    }
}
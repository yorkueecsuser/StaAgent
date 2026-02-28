import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Inserting an unreachable if-else statement
    public void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        } else {
            // Unreachable else block
            System.out.println("This is an unreachable else block.");
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // This ensures the condition is dynamically determined at runtime
    }
}
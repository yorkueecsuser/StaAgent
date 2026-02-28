import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * add this annotation to a field to tell the static analyser that it should not be mutated, making
 * tighter restrictions than normal. e.g. an @Immutable array can't have elements reassigned or to a
 * method to tell that the return value shouldn't be mutated past that point
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Immutable {

    // Inserting an unreachable if-else branch
    public boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    public void someMethod() {
        // Example usage of the getCondition method to create an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            System.out.println("This is unreachable code.");
        } else {
            // This block will always execute
            System.out.println("This is reachable code.");
        }
    }
}
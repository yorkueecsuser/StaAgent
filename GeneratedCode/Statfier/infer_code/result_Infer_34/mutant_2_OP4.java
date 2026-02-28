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
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkUnreachable() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is reachable code.");
        } else {
            // This block is also unreachable due to the same reason
            System.out.println("This is unreachable code.");
        }
    }
}
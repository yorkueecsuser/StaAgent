import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Tell the thread-safety analysis that this method transfers ownership of its return value to its
 * caller. Ownership means that the caller is allowed to both read and write the value outside of
 * synchronization. The annotated method should not retain any references to the value. This
 * annotation is trusted for now, but may be checked eventually.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ReturnsOwnership {

    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block.");
        }
    }
}
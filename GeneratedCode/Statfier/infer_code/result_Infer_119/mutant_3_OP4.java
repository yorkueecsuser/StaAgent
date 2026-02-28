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
        return false; // This method will always return false, ensuring the if-else is unreachable
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never execute because the if condition is always false
            System.out.println("This is an unreachable else block.");
        }
    }
}
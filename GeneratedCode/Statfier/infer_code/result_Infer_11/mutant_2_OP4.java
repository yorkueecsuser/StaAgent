import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks a class as one that is expected to be extended.
 *
 * <p>This annotation is meant to counter common misuses of subclassing. Annotate your class with
 * this only if it was built with the purpose of being extended.
 *
 * <p>Avoid adding this to classes that have existed for a long time without needing it.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface OkToExtend {

    // Introduced an unreachable if-else statement with a dynamically determined condition
    boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant in this context
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block.");
        }
    }
}
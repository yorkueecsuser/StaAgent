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

    // Introduced an unreachable if-else statement
    boolean getCondition() {
        return false;
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never run
            System.out.println("This will never be printed.");
        } else {
            // Alternative code that will always run
            System.out.println("This will always be printed.");
        }
    }
}
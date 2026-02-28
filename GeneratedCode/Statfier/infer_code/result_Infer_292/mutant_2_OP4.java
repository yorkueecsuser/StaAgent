import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {

    // Inserting an unreachable if-else statement
    default void insertUnreachableBranch() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
        } else {
            // This branch is unreachable because shouldRun is always false
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}
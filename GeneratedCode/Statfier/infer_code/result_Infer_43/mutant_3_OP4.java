import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {
    // Introduced an unreachable if-else statement
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
        } else {
            // This else block is unreachable because shouldRun is always false
        }
    }

    default boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}
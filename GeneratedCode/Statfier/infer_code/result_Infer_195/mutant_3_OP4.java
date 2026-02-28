import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Inserting an unreachable if-else statement
    default void insertUnreachableBranch() {
        boolean condition = getCondition();
        if (condition) {
            // This block will execute if condition is true
        } else {
            // This block is unreachable because condition is never set to false
        }
    }

    default boolean getCondition() {
        return true; // Always returns true to make the else block unreachable
    }
}
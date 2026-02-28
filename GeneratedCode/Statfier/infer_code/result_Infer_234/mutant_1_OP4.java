import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Inserting an unreachable if-else statement
    default void insertUnreachableBlock() {
        boolean condition = getCondition();
        if (condition) {
            // Some code that will run if condition is true
        } else {
            // This else block is unreachable because getCondition() always returns false
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else block unreachable
    }
}
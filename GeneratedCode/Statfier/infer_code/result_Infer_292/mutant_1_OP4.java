import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {

    // Added mutant code to introduce an unreachable if-else statement
    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code
        } else {
            // Unreachable code due to shouldRun always being false
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}
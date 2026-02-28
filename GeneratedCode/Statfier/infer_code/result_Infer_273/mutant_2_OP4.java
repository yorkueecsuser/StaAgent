import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {
    // Introduced an unreachable if-else statement with a dynamically determined condition
    default void mutate() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
            System.out.println("This will run if shouldRun is true.");
        } else {
            // Unreachable code due to shouldRun always being false
            System.out.println("This is unreachable code.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else branch unreachable
    }
}
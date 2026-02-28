import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {
    // Adding an unreachable if-else statement
    default void mutate() {
        boolean condition = getCondition();
        if (condition) {
            // Some code that might run if condition is true
        } else {
            // Unreachable code due to condition always being false
            System.out.println("This is an unreachable else block.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}
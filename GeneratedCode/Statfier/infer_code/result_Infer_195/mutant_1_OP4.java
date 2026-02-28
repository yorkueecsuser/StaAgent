import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Adding an unreachable if-else statement
    default void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        } else {
            // Unreachable else block
            System.out.println("This is an unreachable else block.");
        }
    }

    default boolean getCondition() {
        return true; // This ensures the condition is always true, making the else block unreachable
    }
}
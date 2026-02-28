import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false; // This will always return false, making the loop unreachable
    }

    default void someMethod() {
        // Example method to demonstrate insertion of the while loop
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable.");
        }
    }
}
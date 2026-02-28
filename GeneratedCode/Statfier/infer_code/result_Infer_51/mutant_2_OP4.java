import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Method to provide a dynamic condition for the if-else statement
    private boolean getCondition() {
        return false; // This will always return false, making the if-else branch unreachable
    }

    // Example usage of the if-else statement with a dynamic condition
    default void exampleMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed
            System.out.println("This is the unreachable if block.");
        } else {
            // This block will always be executed
            System.out.println("This is the else block.");
        }
    }
}
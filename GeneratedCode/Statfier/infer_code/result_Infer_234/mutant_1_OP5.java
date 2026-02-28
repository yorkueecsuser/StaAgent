import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Method to provide a dynamic condition for the switch statement
    private static boolean getDynamicCondition() {
        return false; // This will always return false, making the switch statement unreachable
    }

    // Example usage of the dynamic condition in a basic block
    default void exampleMethod() {
        boolean condition = getDynamicCondition();
        switch (condition) {
            case true:
                // Unreachable code
                System.out.println("This will never be printed");
                break;
            default:
                // Also unreachable code
                System.out.println("This will also never be printed");
                break;
        }
    }
}
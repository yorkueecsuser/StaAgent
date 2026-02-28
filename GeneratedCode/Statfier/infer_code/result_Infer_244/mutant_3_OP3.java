import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Introduced an unreachable if statement with a dynamically determined condition
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable if statement.");
        }
    }
}
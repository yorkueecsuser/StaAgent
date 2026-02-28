import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Introducing an unreachable if statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant in this context
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}
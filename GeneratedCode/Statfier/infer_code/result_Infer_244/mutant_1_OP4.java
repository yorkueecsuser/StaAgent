import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Introduced a non-final variable to ensure the if-else statement is not compile-time unreachable
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that might run if shouldRun is true
        } else {
            // This else block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable else block due to getCondition() always returning false.");
        }
    }
}
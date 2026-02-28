import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {

    // Mutant code added here
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will never execute because shouldRun is always false
            System.out.println("This will never print");
        } else {
            // Alternative code that will always execute
            System.out.println("This will always print");
        }
    }
}
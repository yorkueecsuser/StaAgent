import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will never execute
            System.out.println("This will never be printed.");
        } else {
            // Alternative code that will also never execute due to the nature of the condition
            System.out.println("This will also never be printed.");
        }
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Introduced an unreachable if-else statement with a dynamic condition
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkUnreachable() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if getCondition() returns true
            System.out.println("This is reachable.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is unreachable.");
        }
    }
}
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

    default void insertUnreachableCode() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable if getCondition() returns true
            System.out.println("This is reachable code.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is unreachable code due to the condition always being false.");
        }
    }
}
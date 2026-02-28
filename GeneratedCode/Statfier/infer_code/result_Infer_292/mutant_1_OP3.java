import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {
    // Adding an unreachable if statement according to the mutation operator
    default void mutate() {
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            System.out.println("This is a reachable block.");
        }
        // Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is intended to be unreachable
            System.out.println("This is an unreachable block.");
        }
    }

    default boolean getCondition() {
        return true; // This method returns true to ensure the first block is reachable
    }

    default boolean isUnreachable() {
        return false; // This method returns false to ensure the second block is unreachable
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {
    // Inserting an unreachable if-else statement
    default void mutate() {
        boolean condition = getCondition();
        if (condition) {
            // This block will execute if condition is true
        } else {
            // This block is unreachable because condition will always be false at runtime
        }
    }

    default boolean getCondition() {
        return false; // This method always returns false, ensuring the else block is unreachable
    }
}
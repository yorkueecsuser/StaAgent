import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {
    // Introduced an unreachable if statement as per the mutation operator
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement due to the mutation.");
        }
    }
}
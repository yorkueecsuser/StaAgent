import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {

    // Introduced an unreachable while loop with a dynamically determined condition
    boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }

    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }
    }
}
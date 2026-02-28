import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {

    // Inserting an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("This is also an unreachable case.");
                break;
        }
    }
}
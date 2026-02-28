import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {

    // Added mutant code following the mutation operator description
    boolean getCondition() {
        return false;
    }

    void someMethod() {
        int value = getValue();
        switch (value) {
            case 1:
                // Some code
                break;
            case 2:
                // Some other code
                break;
            default:
                // Default case
                break;
        }

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case will always be executed
                System.out.println("This is the reachable case.");
                break;
        }
    }

    int getValue() {
        return 1; // Example method to provide a dynamic value
    }
}
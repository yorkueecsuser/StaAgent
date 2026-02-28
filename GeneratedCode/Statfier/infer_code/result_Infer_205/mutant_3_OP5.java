import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {

    // Inserting an unreachable switch statement
    public void someMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch statement unreachable
            case 0:
                System.out.println("This will never be printed");
                break;
            default:
                // Default case to avoid unreachable statement error
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * View can be annotated with @SuppressViewNullability to silence warnings when a view is set to
 * null in a destructor, and created in an initializer.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface SuppressViewNullability {

    // Added mutant: Unreachable switch statement
    default void dummyMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // This is the default case that will always be executed
                System.out.println("This is the reachable default case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}
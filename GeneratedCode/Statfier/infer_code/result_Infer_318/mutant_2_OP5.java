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

    // Inserting an unreachable switch statement
    default void insertUnreachableSwitch() {
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is always false
                System.out.println("This will never be printed");
                break;
            default:
                // Default case is also unreachable due to the same reason
                System.out.println("This will also never be printed");
                break;
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}
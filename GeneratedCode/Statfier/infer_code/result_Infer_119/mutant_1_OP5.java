import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Tell the thread-safety analysis that this method transfers ownership of its return value to its
 * caller. Ownership means that the caller is allowed to both read and write the value outside of
 * synchronization. The annotated method should not retain any references to the value. This
 * annotation is trusted for now, but may be checked eventually.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ReturnsOwnership {

    // Introduced an unreachable switch statement
    public static void introduceUnreachableSwitch() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            default:
                // Default case
                break;
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}
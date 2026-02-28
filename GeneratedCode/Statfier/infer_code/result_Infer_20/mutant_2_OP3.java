import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A method annotated with @Cleanup should always be permitted to nullify fields, even if they are
 * not nullable. Combined with the @Initializer annotation, this allows devs to specify
 * acquire/release methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Cleanup {

    // Introduced an unreachable if statement with a dynamically determined condition
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkUnreachable() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}
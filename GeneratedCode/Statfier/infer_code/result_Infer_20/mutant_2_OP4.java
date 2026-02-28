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
    // Introducing an unreachable if-else statement
    boolean getCondition() {
        return false;
    }

    default void mutateMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This block will always execute.");
        }
    }
}
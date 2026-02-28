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
    default void introduceUnreachableBranch() {
        boolean condition = getCondition();
        if (condition) {
            // Some code that will never be executed due to the condition being false at runtime
            System.out.println("This is an unreachable branch.");
        } else {
            // Alternative code that will also never be executed due to the condition being false at runtime
            System.out.println("This is another unreachable branch.");
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but returns false
    }
}
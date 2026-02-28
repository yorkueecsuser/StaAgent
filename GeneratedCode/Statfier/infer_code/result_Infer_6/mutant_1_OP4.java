import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {

    // Inserting an unreachable if-else statement
    default void insertUnreachableBranch() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
            System.out.println("This will run if shouldRun is true.");
        } else {
            // Unreachable code because shouldRun is always false
            System.out.println("This is unreachable code.");
        }
    }

    default boolean getCondition() {
        return false; // This ensures the else branch is unreachable
    }
}
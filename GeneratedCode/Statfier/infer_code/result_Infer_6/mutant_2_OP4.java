import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {
    // Inserting an unreachable if-else statement
    default boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will never execute because shouldRun is always false
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code that will always execute
            System.out.println("This is reachable code.");
        }
    }
}
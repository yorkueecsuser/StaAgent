import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {

    // Introducing an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will never execute
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code that will always execute
            System.out.println("This is reachable code.");
        }
    }
}
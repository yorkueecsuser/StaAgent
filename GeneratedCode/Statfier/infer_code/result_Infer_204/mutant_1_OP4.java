import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {

    // Added mutant code to introduce an unreachable if-else statement
    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that will run if shouldRun is true
            System.out.println("This code will run if shouldRun is true.");
        } else {
            // Unreachable code due to shouldRun always being false
            System.out.println("This code is unreachable.");
        }
    }

    default boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }
}
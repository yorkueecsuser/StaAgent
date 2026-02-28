import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {

    // Inserting an unreachable if-else statement
    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block.");
        }
    }

    default boolean getCondition() {
        return true; // This ensures the if block is taken, making the else block unreachable
    }
}
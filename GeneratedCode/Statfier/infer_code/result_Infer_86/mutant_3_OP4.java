import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {

    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            System.out.println("This is unreachable code block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable code block.");
        }
    }
}
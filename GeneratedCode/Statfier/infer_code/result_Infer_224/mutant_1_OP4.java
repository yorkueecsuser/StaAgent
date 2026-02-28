import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something user-controlled
      ElementType.PARAMETER, // parameter is user-controlled
      ElementType.FIELD, // field is user-controlled
    })
public @interface IntegritySource {

    // Introduced an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant in this context
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never execute
            System.out.println("This is an unreachable code block.");
        } else {
            // Alternative code that will always execute
            System.out.println("This is the reachable code block.");
        }
    }
}
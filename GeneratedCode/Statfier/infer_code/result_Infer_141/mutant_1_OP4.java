import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something private
      ElementType.PARAMETER, // parameter is private
      ElementType.FIELD, // field is private
    })
public @interface PrivacySource {

    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never run
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code that will always run
            System.out.println("This is reachable code.");
        }
    }
}
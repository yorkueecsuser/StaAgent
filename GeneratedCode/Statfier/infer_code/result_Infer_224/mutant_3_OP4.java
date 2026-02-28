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

    // Added mutant code
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block is reachable
            System.out.println("This is a reachable else block.");
        }
    }
}
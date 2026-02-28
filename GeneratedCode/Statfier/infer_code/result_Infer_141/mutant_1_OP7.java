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

    // Mutant code added here
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void unreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
    }
}
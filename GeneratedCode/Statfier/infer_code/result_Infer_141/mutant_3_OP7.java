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

    // Inserting an unreachable while loop
    boolean getCondition() {
        return false;
    }

    default void insertUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop.");
        }
    }
}
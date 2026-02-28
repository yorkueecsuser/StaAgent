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

    // Mutant code being added
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void unreachableSwitchStatement() {
        int value = getValue(); // Ensure the switch expression is dynamically determined
        switch (value) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    default int getValue() {
        return 0; // This method will always return 0, making the switch statement unreachable
    }
}
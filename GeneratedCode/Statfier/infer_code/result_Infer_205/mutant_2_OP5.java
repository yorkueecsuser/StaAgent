import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a user-controlled should not flow to this parameter
)
public @interface IntegritySink {

    // Method to provide a dynamic condition for the switch statement
    private int getDynamicValue() {
        return 0; // This will always return 0, making the switch statement unreachable
    }

    // Inserting an unreachable switch statement
    private void unreachableSwitch() {
        int value = getDynamicValue();
        switch (value) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("This will also never be printed");
                break;
            default:
                System.out.println("Default case, but still unreachable");
                break;
        }
    }
}
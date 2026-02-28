import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {

    // Method to provide a value that will never match any case in the switch statement
    private int getUnreachableValue() {
        return -1; // This value will never match any case in the switch statement
    }

    // Adding an unreachable switch statement
    private void addUnreachableSwitch() {
        int value = getUnreachableValue();
        switch (value) {
            case 0:
                System.out.println("Case 0");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
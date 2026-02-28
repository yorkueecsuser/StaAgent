import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {

    // Added a method to demonstrate the insertion of the unreachable switch statement
    default void demonstrateUnreachableSwitch() {
        boolean condition = getCondition(); // This method will return false, making the switch statement unreachable

        switch (condition) {
            case true:
                System.out.println("This will never be printed because condition is always false.");
                break;
            default:
                System.out.println("Default case will also never be reached.");
                break;
        }
    }

    // Method to simulate a dynamic condition that always returns false
    private static boolean getCondition() {
        return false;
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
public @interface AutoCleanup {
    // Added an unreachable switch statement based on the mutation operator
    boolean getCondition() {
        return false;
    }

    default void performUnreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
                break;
        }
    }
}
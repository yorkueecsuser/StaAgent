import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {

    // Adding an unreachable switch statement
    default void dummyMethod() {
        boolean condition = getCondition();
        switch (getValue(condition)) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                System.out.println("This is unreachable default case");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This ensures the condition is always false, making the switch unreachable
    }

    private int getValue(boolean condition) {
        return condition? 1 : 0; // This will always return 0, making the switch cases unreachable
    }
}
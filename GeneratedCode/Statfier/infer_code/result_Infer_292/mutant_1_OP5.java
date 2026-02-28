import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {

    // Added an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because condition is always false
            switch (getValue()) {
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                default:
                    System.out.println("Default Case");
            }
        }
    }

    default int getValue() {
        return 0;
    }
}
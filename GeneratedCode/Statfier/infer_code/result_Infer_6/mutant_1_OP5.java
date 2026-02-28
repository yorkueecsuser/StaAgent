import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {

    // Adding an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will execute
                System.out.println("Default case executed.");
                break;
        }
    }
}
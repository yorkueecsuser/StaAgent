import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Introduced an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void introduceUnreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // This is the only reachable case
                System.out.println("This is the reachable default case.");
                break;
        }
    }
}
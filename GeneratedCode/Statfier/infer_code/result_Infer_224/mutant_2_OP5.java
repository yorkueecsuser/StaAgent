import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something user-controlled
      ElementType.PARAMETER, // parameter is user-controlled
      ElementType.FIELD, // field is user-controlled
    })
public @interface IntegritySource {

    // Introduced an unreachable switch statement
    public void dummyMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            default:
                // This is the only reachable case
                System.out.println("This is the only reachable case");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }
}
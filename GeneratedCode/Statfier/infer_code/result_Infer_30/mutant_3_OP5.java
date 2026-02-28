import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullMethodCall {

    // Added mutant code to introduce an unreachable switch statement
    public boolean getCondition() {
        return false;
    }

    public void someMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // This ensures the switch is unreachable
            case 0:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }
}
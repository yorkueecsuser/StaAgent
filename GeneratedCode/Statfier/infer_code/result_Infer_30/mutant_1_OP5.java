import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullMethodCall {

    // Adding an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }
}
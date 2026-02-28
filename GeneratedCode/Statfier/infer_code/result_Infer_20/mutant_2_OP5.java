import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A method annotated with @Cleanup should always be permitted to nullify fields, even if they are
 * not nullable. Combined with the @Initializer annotation, this allows devs to specify
 * acquire/release methods.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Cleanup {

    // Introduced an unreachable switch statement
    boolean getCondition() {
        return false;
    }

    default void introduceUnreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code.");
                break;
            default:
                System.out.println("This is also unreachable code.");
                break;
        }
    }
}
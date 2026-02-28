import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Signal to the starvation checker that the method (or all the methods of the class,
// if at class level) does not perform any potentially blocking operations.  Can be used to
// effectively filter out all method calls which Infer may consider blocking.  This means that
// not only Infer will not warn on any starvation issues in the method, but will also not warn on
// any of the callers of this method.
public @interface NonBlocking {

    // Introduced an unreachable switch statement
    default void introduceUnreachableSwitch() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is unreachable");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is reachable");
                break;
        }
    }

    default boolean getCondition() {
        return false;
    }
}
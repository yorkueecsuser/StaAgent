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

    // Introduced an unreachable switch statement to adhere to the mutation operator
    default void dummyMethod() {
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is always false
                System.out.println("This is unreachable");
                break;
            default:
                // Default case is also unreachable due to the nature of alwaysFalse
                System.out.println("This is also unreachable");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}
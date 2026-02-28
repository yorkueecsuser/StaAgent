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

    // Introduced an unreachable if-else statement
    default void dummyMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
        } else {
            // Unreachable code due to shouldRun always being false in practice
            System.out.println("This is an unreachable else block.");
        }
    }

    // Method to simulate dynamic condition determination
    private static boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}
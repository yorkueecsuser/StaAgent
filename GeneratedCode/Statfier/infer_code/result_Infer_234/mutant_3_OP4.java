import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {

    // Mutant code being added
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant in this context
    }

    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            System.out.println("This is an unreachable if block");
        } else {
            // Some alternative code that should always run
            System.out.println("This is the else block that will always execute");
        }
    }
}
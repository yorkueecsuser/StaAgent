import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullMethodCall {

    // Mutant code being added
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void mutantMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            System.out.println("This should never be printed");
        } else {
            // Alternative code that should also never run due to the nature of the mutant
            System.out.println("This should also never be printed");
        }
    }
}
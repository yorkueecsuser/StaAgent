import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {
    // Added mutant code with an unreachable if-else statement
    default void mutantMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        } else {
            // Unreachable code
            System.out.println("This is an unreachable else block.");
        }
    }

    default boolean getCondition() {
        return true; // This ensures the condition is always true, making the else block unreachable
    }
}
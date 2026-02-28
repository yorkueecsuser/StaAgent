import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A class field, or method return/parameter type, of Optional type is annotated @Present to
 * indicate that its value cannot be absent. Users of the method/field and static checkers must
 * enforce, and can rely on, this invariant.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.TYPE,
  ElementType.FIELD,
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PARAMETER
})
public @interface Present {

    // Introduced an unreachable if-else statement with a dynamically determined condition
    default void mutate() {
        boolean condition = getCondition();
        if (condition) {
            // Some code that will never run because condition is always false
            System.out.println("This will never print");
        } else {
            // Alternative code that will also never run because condition is always false
            System.out.println("This will also never print");
        }
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}
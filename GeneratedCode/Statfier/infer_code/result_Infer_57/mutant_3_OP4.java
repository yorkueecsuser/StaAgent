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
    // Inserting an unreachable if-else statement
    default void dummyMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Some code
        } else {
            // Unreachable code
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }
}
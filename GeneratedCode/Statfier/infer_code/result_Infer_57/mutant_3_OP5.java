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
    // Adding an unreachable switch statement
    default void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be reached because getCondition() is expected to return false
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case to satisfy switch requirement
                break;
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void someMethod() {
        // This method is just to provide a basic block where we can insert the unreachable while loop
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
    }
}
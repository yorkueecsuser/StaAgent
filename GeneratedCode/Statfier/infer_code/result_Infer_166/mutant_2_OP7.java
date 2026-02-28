import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressParameterNotNullable {
    // Introduced an unreachable while loop with a dynamic condition
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This loop is unreachable.");
        }
    }
}
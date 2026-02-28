import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Expensive {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void introduceUnreachableLoop() {
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
    }
}
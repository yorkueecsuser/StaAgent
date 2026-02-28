import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();

    default boolean getCondition() {
        return false;
    }

    default void insertUnreachableLoop() {
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
    }
}
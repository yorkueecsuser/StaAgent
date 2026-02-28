import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    default boolean getCondition() {
        return false;
    }

    default void introduceUnreachableLoop() {
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This loop will never execute.");
        }
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Tell the analysis that a collection is thread-safe when this information is not already reflected
 * in the collection's type. For example: private {@literal @SynchronizedCollection} Map mMap =
 * Collections.synchronizedMap(...);
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface SynchronizedCollection {

    // Introduced an unreachable while loop with a dynamic condition
    boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }

    default void introduceUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable.");
        }
    }
}
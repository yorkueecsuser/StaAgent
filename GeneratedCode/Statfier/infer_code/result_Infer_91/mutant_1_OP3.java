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

    // Introduced an unreachable if statement with a dynamically determined condition
    boolean getCondition() {
        return false; // This method will always return false, but it is not a compile-time constant
    }

    default void checkUnreachable() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}
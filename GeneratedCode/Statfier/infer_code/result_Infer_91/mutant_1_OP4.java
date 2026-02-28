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

    // Mutant code starts here
    default boolean getCondition() {
        return false;
    }

    default void unreachableBlock() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run.");
        } else {
            System.out.println("This is also unreachable due to the nature of getCondition().");
        }
    }
}
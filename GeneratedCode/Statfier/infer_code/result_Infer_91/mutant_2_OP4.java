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

    // Mutant code added below
    default boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            System.out.println("This should never be printed.");
        } else {
            // Alternative code that should also never run due to the nature of the mutation
            System.out.println("This should also never be printed.");
        }
    }
}
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks a class as one that is expected to be extended.
 *
 * <p>This annotation is meant to counter common misuses of subclassing. Annotate your class with
 * this only if it was built with the purpose of being extended.
 *
 * <p>Avoid adding this to classes that have existed for a long time without needing it.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface OkToExtend {

    // Introduced an unreachable for loop as per the mutation operator
    boolean getCondition() {
        return false;
    }

    default void someMethod() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This is an unreachable loop iteration.");
        }
    }
}
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
    // Adding an unreachable while loop as per the mutation operator description
    boolean conditionWhile = false;

    default boolean getCondition() {
        return conditionWhile;
    }

    default void dummyMethod() {
        boolean condition = getCondition();
        while (condition) {
            // This loop is unreachable because conditionWhile is false and getCondition returns conditionWhile
        }
    }
}
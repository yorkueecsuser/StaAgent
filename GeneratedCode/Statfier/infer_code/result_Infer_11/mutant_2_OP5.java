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

    // Added unreachable switch statement
    default void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            case 1:
                // This is the only reachable case
                System.out.println("This will always be printed");
                break;
        }
    }

    default boolean getCondition() {
        return false;
    }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Tell the thread-safety analysis that this method transfers ownership of its return value to its
 * caller. Ownership means that the caller is allowed to both read and write the value outside of
 * synchronization. The annotated method should not retain any references to the value. This
 * annotation is trusted for now, but may be checked eventually.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface ReturnsOwnership {

    // Inserting an unreachable for loop as per the mutation operator description
    boolean getCondition() {
        return false; // This method will always return false, making the loop condition dynamically determined
    }

    default void insertUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop is unreachable");
        }
    }
}
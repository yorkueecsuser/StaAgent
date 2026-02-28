import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Any method, override of a method annotated @Lockless,
// or a method whose class or superclass is annotated @Lockless, may not acquire a lock
public @interface Lockless {
    // Introducing an unreachable if-else statement
    default boolean getCondition() {
        return false;
    }

    default void introduceUnreachableBranch() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable else block.");
        }
    }
}
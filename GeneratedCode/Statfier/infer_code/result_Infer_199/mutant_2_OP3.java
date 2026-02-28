import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Any method, override of a method annotated @Lockless,
// or a method whose class or superclass is annotated @Lockless, may not acquire a lock
public @interface Lockless {
    // Inserting an unreachable if statement
    default boolean getUnreachableCondition() {
        return false;
    }

    default void insertUnreachableIf() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable statement.");
        }
    }
}
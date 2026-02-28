import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Any method, override of a method annotated @Lockless,
// or a method whose class or superclass is annotated @Lockless, may not acquire a lock
public @interface Lockless {

    // Inserting an unreachable switch statement
    default void insertUnreachableSwitch() {
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable because alwaysFalse is always false
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case is also unreachable for the same reason
                System.out.println("This will also never be printed.");
                break;
        }
    }

    // Method to provide a dynamically determined false value
    default boolean getAlwaysFalse() {
        return false;
    }
}
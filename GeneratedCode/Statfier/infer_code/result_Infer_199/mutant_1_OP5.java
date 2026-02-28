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
    default void unreachableSwitch() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case
                break;
        }
    }

    // Method to provide a dynamic condition
    default boolean getCondition() {
        return false; // This ensures the switch condition is always false
    }
}
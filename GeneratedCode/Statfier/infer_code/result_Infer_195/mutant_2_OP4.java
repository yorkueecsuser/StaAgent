import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {
    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, making the if-else unreachable
    }

    default void checkCondition() {
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never be executed because the if condition is always false
            System.out.println("This is an unreachable else block.");
        }
    }
}
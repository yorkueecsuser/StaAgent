import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullFieldAccess {

    // Inserting an unreachable if statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void someMethod() {
        // Example method to insert the unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }
}
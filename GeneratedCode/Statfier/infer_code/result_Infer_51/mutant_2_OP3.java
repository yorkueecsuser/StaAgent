import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Introduced an unreachable if statement with a dynamic condition
    boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    default void someMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable if statement.");
        }
    }
}
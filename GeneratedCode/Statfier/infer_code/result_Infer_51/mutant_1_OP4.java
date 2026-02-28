import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotNullable {

    // Inserted unreachable if-else statement
    default void dummyMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code
        } else {
            // Unreachable code
        }
    }

    default boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}
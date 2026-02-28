import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Mutable {
    // Introduced an unreachable if-else statement with a dynamic condition
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that should never run
            System.out.println("This will never print.");
        } else {
            // Alternative code that will always run
            System.out.println("This will always print.");
        }
    }
}
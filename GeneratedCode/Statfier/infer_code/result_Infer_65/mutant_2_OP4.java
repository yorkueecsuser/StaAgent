import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.TYPE,
})
public @interface Verify {
    // Inserting an unreachable if-else statement
    boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant in this context
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never execute
            System.out.println("This will never be printed.");
        } else {
            // Alternative code that will also never execute due to the nature of the method
            System.out.println("This will also never be printed.");
        }
    }
}
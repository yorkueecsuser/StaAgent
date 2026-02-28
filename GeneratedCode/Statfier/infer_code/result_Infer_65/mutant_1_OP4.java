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
    default boolean getCondition() {
        return false;
    }

    default void checkCondition() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that will never run
            System.out.println("This is unreachable code.");
        } else {
            // Alternative code that will always run
            System.out.println("This is reachable code.");
        }
    }
}
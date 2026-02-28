import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
})
public @interface SuppressLint {
  String[] value();

  // Added mutant code to introduce an unreachable if-else statement
  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  default boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Similar to the {@literal @ThreadSafe} annotation from javax.concurrent.annotation, but can be
 * applied to methods. In addition, you can ask Infer to assume thread-safety rather than checking
 * it by using {@literal @ThreadSafe(enableChecks = false)}.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface ThreadSafe {
  boolean enableChecks() default true;

  // Added mutant code with an unreachable if-else statement
  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false in this context
    }
  }

  default boolean getCondition() {
    return false; // This method ensures that the condition is always false, making the else block unreachable
  }
}
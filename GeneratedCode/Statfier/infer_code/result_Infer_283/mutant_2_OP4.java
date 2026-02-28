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

  // Introduced an unreachable if-else statement with a dynamic condition
  default void checkUnreachable() {
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable if condition is false
      System.out.println("This is an unreachable block.");
    }
  }

  default boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}
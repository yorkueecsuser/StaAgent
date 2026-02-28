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

  // Introduced an unreachable while loop according to the mutation operator
  boolean conditionWhile = getCondition();
  while (conditionWhile) {
    // This loop is unreachable because getCondition() will return false at runtime
  }

  // Method to simulate dynamic determination of condition
  private static boolean getCondition() {
    return false;
  }
}
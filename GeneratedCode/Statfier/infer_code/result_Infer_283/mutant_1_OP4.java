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

  // Mutant code added here
  default boolean getCondition() {
    return false;
  }

  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This code is unreachable.");
    } else {
      // Alternative code that will always run
      System.out.println("This code is always reachable.");
    }
  }
}
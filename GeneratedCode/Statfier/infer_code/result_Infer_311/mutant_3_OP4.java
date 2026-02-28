import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Mutant code added here
  default boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block is reachable
      System.out.println("This is a reachable else block.");
    }
  }
}
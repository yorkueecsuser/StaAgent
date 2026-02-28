import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Added mutant code following the mutation operator description
  default boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  default void mutantMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block.");
    }
  }
}
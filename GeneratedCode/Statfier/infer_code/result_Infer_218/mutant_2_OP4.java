import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface Prop {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  String varArg() default "";

  // Mutant code added below
  default boolean getCondition() {
    return false;
  }

  default void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This is an unreachable if block.");
    } else {
      // Alternative code that should always run
      System.out.println("This is the reachable else block.");
    }
  }
}
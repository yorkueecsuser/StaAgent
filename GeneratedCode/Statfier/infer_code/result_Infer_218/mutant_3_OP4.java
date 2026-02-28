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

  // Inserting an unreachable if-else statement
  default void checkCondition() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This code will run if shouldRun is true.");
    } else {
      // Unreachable code
      System.out.println("This code is unreachable.");
    }
  }

  default boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}
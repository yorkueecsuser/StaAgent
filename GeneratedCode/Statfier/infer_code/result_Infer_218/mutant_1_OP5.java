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

  // Introduced an unreachable switch statement
  default void unreachableSwitch() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  // Helper method to simulate a dynamic condition
  private default boolean getCondition() {
    return false;
  }
}
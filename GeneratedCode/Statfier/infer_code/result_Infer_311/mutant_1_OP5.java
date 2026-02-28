import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
  ResType resType() default ResType.NONE;

  boolean optional() default false;

  // Mutant code starts here
  private static boolean getCondition() {
    return false;
  }

  default void unreachableSwitch() {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case
        break;
    }
  }
}